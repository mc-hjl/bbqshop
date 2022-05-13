package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.bean.Order;

public interface OrderService {
    void newOrder(Order order,String item_id,String stock);
}
