package Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager.*;
import javax.swing.*;

import menu.*;
/*
 * Created by JFormDesigner on Sat Apr 30 18:40:49 CST 2022
 */



/**
 * @author 1
 */
public class relogin extends JFrame {
    public relogin() {
        initComponents();
    }

    private void initComponents() {
        zhuce zhuce1 =new zhuce();
        String xinzhanghao="";
        xinzhanghao = String.valueOf(zhuce1.zhanghao1);//获取刚刚注册所获得的账号
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField(xinzhanghao);
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("          用户登录");
        contentPane.add(label1);
        label1.setBounds(135, 25, 125, 25);

        //---- label2 ----
        label2.setText("   账号：");
        contentPane.add(label2);
        label2.setBounds(50, 60, 60, label2.getPreferredSize().height);

        //---- label3 ----
        label3.setText("   \u5bc6\u7801\uff1a");
        contentPane.add(label3);
        label3.setBounds(50, 110, 60, label3.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(150, 60, 100, 25);
        contentPane.add(textField2);
        textField2.setBounds(150, 110, 100, 25);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addActionListener(
                e -> {
                    String username=textField1.getText();
                    String password=textField2.getText();
                    String sql="SELECT * from SYS_customer where cust_id=? AND cust_password=?";
                    System.out.println(sql);

                    String user="zsx";
                    String dbPassword="zsx1234GuEt";
                    String url="jdbc:oracle:thin:@139.9.192.221:1521:orcl";
                    ResultSet rs=null;
                    PreparedStatement stmt=null;
                    Connection conn=null;
                    try {
                        conn=DriverManager.getConnection(url,user,dbPassword);
                        stmt=conn.prepareStatement(sql);
                        stmt.setString(1,username);
                        stmt.setString(2,password);
                        rs =stmt.executeQuery();
                        if(rs.next()){
                            System.out.println("登录成功");
                            this.setVisible(false);
                            mainmenu mmenu=new mainmenu();
                            mmenu.setVisible(true);

                        }
                        else
                        {
                            System.out.println("用户名或密码错误");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }


                }
        );
        contentPane.add(button1);
        button1.setBounds(120, 180, 180, button1.getPreferredSize().height);

        //注册的按钮
        button2.setText("注册");
        button2.addActionListener(
                e -> {
                    this.setVisible(false);
                    zhuce zhuce2 = new zhuce();
                    zhuce2.setVisible(true);
                }
        );
        contentPane.add(button2);
        button2.setBounds(120, 220, 180, button2.getPreferredSize().height);



        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new relogin();
    }
}
