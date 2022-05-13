package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.bean.Order;
import cn.edu.guet.weappdemo.dao.OrderDao;
import cn.edu.guet.weappdemo.dao.StockDao;
import cn.edu.guet.weappdemo.dao.impl.OrderDaoImpl;
import cn.edu.guet.weappdemo.dao.impl.StockDaoImpl;
import cn.edu.guet.weappdemo.service.OrderService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrderServiceImpl implements OrderService{
    @Override
    public void newOrder(Order order,String item_id,String stock){
        Connection conn=null;
        try{
            OrderDao orderDao = new OrderDaoImpl();
            StockDao stockDao=new StockDaoImpl();

            String user = "root";
            String dbPassword = "hjlljh";
            String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            conn = DriverManager.getConnection(url,user,dbPassword);

            conn.setAutoCommit(false);

            orderDao.newOrder(order);
            stockDao.updateStock(Integer.parseInt(item_id),Integer.parseInt(stock));
            conn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try{
                conn.rollback();
                System.out.println("事务回滚.................................");
            }catch(SQLException ex){}
        }

    }
}
