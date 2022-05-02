package Login;

import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

import Stock.*;

public class balogin extends JFrame{
    public balogin() {
        initComponents();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField("166594");
        label2 = new JLabel();
        textField2 = new JTextField("jiayou");
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d\uff1a");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(115, 90), label1.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(185, 85, 100, textField1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(120, 125), label2.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(185, 120, 100, textField2.getPreferredSize().height);

        //---- button1 ----
        button1.addActionListener(
                (e) -> {
                    /*
                    1、拿到登录界面的用户名和密码
                    2、去和数据库中的用户名和密码比对
                    3、创建了数据库和表
                    4、添加一条记录
                    INSERT INTO sys_user (id,name,password) VALUES(1111,'guet','guet1234');
                     */
                    String username = textField1.getText();
                    String password = textField2.getText();

                    String user = "zsx";
                    String dbPassword = "zsx1234GuEt";
                    String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";

                    Connection conn = null;
                    String sql="SELECT * from sys_user where name=? AND password=?";
                    System.out.println(sql);
                    ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    PreparedStatement stmt = null;//防注入

                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);


                        stmt=conn.prepareStatement(sql);
                        stmt.setString(1,username);
                        stmt.setString(2,password);
                        rs = stmt.executeQuery();
                        if (rs.next()) {//让游标向下移动一次
                            System.out.println("登录成功");
                            orderStock orst = new orderStock();
                            orst.setVisible(true);//显示另一个界面
                            //同时隐藏登录界面
                            this.setVisible(false);
                        } else {
                            System.out.println("用户名或密码错误");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
        );
        button1.setText("\u767b\u5f55");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(170, 185), button1.getPreferredSize()));


        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);//设置组件可见
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        new balogin();
    }
}
