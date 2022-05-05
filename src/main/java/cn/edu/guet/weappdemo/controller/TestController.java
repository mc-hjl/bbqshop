package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.Order;
import cn.edu.guet.weappdemo.dao.OrderDao;
import cn.edu.guet.weappdemo.dao.StockDao;
import cn.edu.guet.weappdemo.dao.impl.OrderDaoImpl;
import cn.edu.guet.weappdemo.dao.impl.StockDaoImpl;
import cn.edu.guet.weappdemo.service.OrderService;
import cn.edu.guet.weappdemo.service.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author liwei
 * @Date 2021-08-04 11:28
 * @Version 1.0
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/auth")
    public String auth(@RequestParam("code") String code) {
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxd9a46e74fc279fcc&secret=7deb521448e11ddbc163fca849648198&code=" + code + "&grant_type=authorization_code";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }

    @PostMapping("/result")
    public String result(HttpServletRequest request) {

        BufferedReader reader = null;
        try {
            reader = request.getReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = "";
        StringBuffer inputString = new StringBuffer();

        try {
            while ((line = reader.readLine()) != null) {
                inputString.append(line);
            }
            request.getReader().close();
            String response = inputString.toString();//接收的回调结果（支付成功后，腾讯调用我们的接口，并发数据给我们）
            System.out.println("回调结果：" + response);
            String pattern =
                    ".+<attach><!\\[CDATA\\[(.+);.+" +
                            "<mch_id><!\\[CDATA\\[(\\d{10}).+" +
                            "<out_trade_no><!\\[CDATA\\[(.{32}).+" +
                            "<time_end><!\\[CDATA\\[(\\d{14}).+" +
                            "<transaction_id><!\\[CDATA\\[(\\d{28})";
            Pattern r = Pattern.compile(pattern);
            // 现在创建 matcher 对象
            Matcher m = r.matcher(response);
            if (m.find()) {

                String itemInfo = m.group(1);
                String item[] = itemInfo.split(";");

                String item_id = item[0].split(",")[1];
                String item_price = item[1].split(",")[1];
                String item_amount = item[2].split(",")[1];
                String mch_id = m.group(2);
                String orderNo = m.group(3);
                String orderTime = m.group(4);
                String transactionId = m.group(5);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                Timestamp timestamp = new Timestamp(sdf.parse(orderTime).getTime());

                Order order = new Order();
                String id = UUID.randomUUID().toString().replace("-", "");
                System.out.println(id);
                order.setId(id);
                order.setMch_id(Integer.parseInt(mch_id));
                order.setOut_trade_no(orderNo);
                order.setOrder_time(timestamp);
                order.setTransaction_id(transactionId);
                order.setUserId(0);
                order.setItem_id(11111);
                order.setItem_price(18.00f);
                order.setAmount(1);
                order.setOrder_price(18.00f);

                OrderService orderService=new OrderServiceImpl();

                orderService.newOrder(order,item_id,item_amount);


                // 我们现在拿不到商品ID、商品价格、购买的数量

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
