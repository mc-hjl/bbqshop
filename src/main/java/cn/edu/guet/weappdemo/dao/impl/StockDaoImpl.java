package cn.edu.guet.weappdemo.dao.impl;

import cn.edu.guet.weappdemo.dao.StockDao;
import cn.edu.guet.weappdemo.util.ConnectionHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StockDaoImpl implements StockDao {
    @Override
    public void updateStock(int item_id, int stock)throws SQLException {
        Connection conn=null;
        try {
            conn= ConnectionHandler.getConn();
            String sql="UPDATE item_stock SET stock=stock-? WHERE item_id=?";
            PreparedStatement pstmt=conn.prepareStatement(sql);

            pstmt.setInt(1,stock);
            pstmt.setInt(2,item_id);

            pstmt.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw  new SQLException("库存更新失败");
        }
    }
}
