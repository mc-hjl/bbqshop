/*
 * Created by JFormDesigner on Wed May 04 00:36:26 CST 2022
 */

package cn.edu.guet.weappdemo.Stock;


import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 * @author 1
 */
public class erciqveding extends JFrame {
    public erciqveding() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- lable1 ----
        label1.setText("\u60a8\u662f\u5426\u786e\u5b9a\u5bf9\u6b64\u6761\u4fe1\u606f\u8fdb\u884c\u5220\u9664\u64cd\u4f5c\uff1f");
        contentPane.add(label1);
        label1.setBounds(80, 50, label1.getPreferredSize().width, 80);

        //---- button1 ----
        button1.setText("\u53d6\u6d88");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(80, 165), button1.getPreferredSize()));
        button1.addActionListener(
                e -> {
                    this.setVisible(false);
                    orderStock orderstock=new orderStock("");
                    orderstock.setVisible(true);

                }
        );


        //---- button2 ----
        button2.setText("\u786e\u5b9a");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(230, 165), button2.getPreferredSize()));
        button2.addActionListener(
                e -> {
                    this.setVisible(false);
                    String user = "zsx";
                    String dbPassword = "zsx1234GuEt";
                    String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";

                    orderStock orderstock = new orderStock("");

                    String date1=orderstock.name1;
                    System.out.println(date1);
                    String sql="delete from StoreHouse where Goods_name = " + "'"+date1+"'";
                    ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    Statement stmt = null;//语句对象，容易产生注入攻击
                    Connection conn = null;
                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);
                        stmt = conn.createStatement();
                        rs = stmt.executeQuery(sql);
                        orderStock orderstock1=new orderStock("");
                        orderstock1.setVisible(true);

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
        );


        contentPane.setPreferredSize(new Dimension(350, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
