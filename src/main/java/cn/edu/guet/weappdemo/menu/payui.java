package cn.edu.guet.weappdemo.menu;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import cn.edu.guet.weappdemo.wxpay.pay.WXPay;

public class payui extends JFrame{
    String sl;
    Float expend;




    private static final Box base = Box.createVerticalBox();//设置盒子，用来存放 jlabel 标签
    private static final Box box1 = Box.createHorizontalBox();
    private static final Box box2 = Box.createHorizontalBox();

    public payui(String sl, float expend){
        WXPay p = new WXPay();
        p.unifiedOrder(expend);
        ImageIcon image = new ImageIcon("C:\\study\\hjlproject\\bbqshop\\二维码.jpg");
        image.setImage(image.getImage().getScaledInstance(200, 200, 500));//设置图片大小

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jlabel = new JLabel("微信支付", SwingConstants.CENTER);//创建一个标签用于存放图标icon
        JLabel jlabel2 = new JLabel();

        //jlabel.setHorizontalAlignment(SwingConstants.CENTER);//设置标签内容水平对齐
        //jlabel.setVerticalAlignment(SwingConstants.CENTER);//设置标签内容垂直对齐

        jlabel2.setIcon(image);//将图片添加到标签中
        jlabel2.setIcon(image);//将图片添加到标签中

        box1.add(jlabel);
        box2.add(jlabel2);
        base.add(box1);
        base.add(box2);

        this.add(base);






    }
}