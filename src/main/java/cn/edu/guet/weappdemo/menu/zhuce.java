/*
 * Created by JFormDesigner on Fri May 13 23:59:13 CST 2022
 */

package cn.edu.guet.weappdemo.menu;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 * @author 1
 */
public class zhuce extends JFrame {
    private static String zhanghao="";
    public String zhanghao1=zhanghao;;
    //用于获取账号
    public static void setZhanghao(String zhanghao) {
        zhuce.zhanghao = zhanghao;
    }

    public zhuce()  {
        initComponents();
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();//用户名
        textField2 = new JTextField();//密码
        textField3 = new JTextField();//确定密码
        button1 = new JButton();


        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d\uff1a");
        contentPane.add(label1);
        label1.setBounds(50, 35, 50, 20);

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        contentPane.add(label2);
        label2.setBounds(50, 90, 45, 15);

        //---- label3 ----
        label3.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(50, 135), label3.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(115, 35, 120, textField1.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(115, 85, 120, textField2.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(115, 135, 120, textField3.getPreferredSize().height);

        //---- button1 注册----
        button1.setText("\u6ce8\u518c ");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(135, 200), button1.getPreferredSize()));
        button1.addActionListener(
        e -> {
            String mima="0";//为密码设计初值
            String qverenmima="1";//为确定密码设置初值
            mima=textField2.getText();//获取密码
            System.out.println(mima);
            qverenmima=textField3.getText();//获取确定密码
            System.out.println(qverenmima);

            if(equals(mima) == equals(qverenmima)) {
                String user = "zsx";
                String dbPassword = "zsx1234GuEt";
                String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";

                int max = 999999;
                int min = 100000;
                // random后面 x 代表取的个数  + 后面代表最小取值
                int random = (int) (Math.random() * (max - min + 1) + min);

                String zhanghao = String.valueOf(random);//取生成的随机数为账号

                setZhanghao(zhanghao);//获取账号，用于传参
                System.out.println(zhanghao);
                Connection conn = null;
                String sql = "insert into SYS_customer values(" +"'"+textField1.getText() + "',"+ zhanghao + ",'" + mima  +"')";
                System.out.println(sql);
                ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                        try {
                            conn = DriverManager.getConnection(url, user, dbPassword);
                            Statement stmt = null;//语句对象，容易产生注入攻击
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery(sql);
                            this.setVisible(false);
                            zhucechenggong zhucechenggong1 = new zhucechenggong();
                            zhucechenggong1.setVisible(true);
                        } catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }else
                    {
                        System.out.println("确认密码错误，请重新再输入");
                    }
                }
        );


            // compute preferred size
        contentPane.setPreferredSize(new Dimension(400, 300));

        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
