package Stock;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 02 00:20:41 CST 2022
 */



/**
 * @author 1
 */
public class updateStock extends JFrame {
    public updateStock() {
        initComponents();
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";
        orderStock orst1 = new orderStock();


        label1 = new JLabel();
        textField1 = new JTextField(orst1.xiugai11);
        label2 = new JLabel();
        textField2 = new JTextField(orst1.xiugai22);
        label3 = new JLabel();
        textField3 = new JTextField(orst1.xiugai33);
        label4 = new JLabel();
        textField4 = new JTextField(orst1.xiugai44);
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("id");
        contentPane.add(label1);
        label1.setBounds(25, 40, 20, label1.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(100, 35, 95, textField1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("\u5546\u54c1\u540d\u79f0");
        contentPane.add(label2);
        label2.setBounds(20, 100, 60, label2.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(100, 95, 95, textField2.getPreferredSize().height);

        //---- label3 ----
        label3.setText("\u5355\u4ef7");
        contentPane.add(label3);
        label3.setBounds(25, 155, 35, label3.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(100, 150, 95, textField3.getPreferredSize().height);

        //---- label4 ----
        label4.setText("\u5e93\u5b58");
        contentPane.add(label4);
        label4.setBounds(25, 205, label4.getPreferredSize().width, 25);
        contentPane.add(textField4);
        textField4.setBounds(100, 210, 95, textField4.getPreferredSize().height);

        //---- button1 ----
        button1.setText("修改");
        contentPane.add(button1);
        button1.setBounds(100, 260, 105, button1.getPreferredSize().height);
        button1.addActionListener(
                e -> {
                    /*int index1 = table1.getSelectedRow();//获取选中行
                    int column1 = table1.getSelectedColumnCount();//获取选中列
                    System.out.println(table1.getValueAt(index1,column1));*/

                    //将框框里的字符串转化为数字
                    int xiugai01= Integer.parseInt(textField1.getText());
                    String xiugai02 = textField2.getText();
                    Float xiugai03= Float.valueOf(textField3.getText());
                    int xiugai04= Integer.parseInt(textField4.getText());


                    // 拼sql，容易有注入攻击
                    orderStock orst2 = new orderStock();
                    int a1= orst2.hang1;
                    String sql="delete from StoreHouse where Goods_id = " + a1;
                    String sql2 = "Insert Into StoreHouse Values("+xiugai01+","+"'"+xiugai02+"'"+","+xiugai03+","+xiugai04+")";
                    String sql3 = "select * from StoreHouse order by Goods_id";
                    System.out.println(sql);
                    ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    ResultSet rs2 = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    Statement stmt = null;//语句对象，容易产生注入攻击
                    Connection conn = null;
                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);
                        stmt = conn.createStatement();
                        stmt.executeQuery(sql);
                        stmt.executeQuery(sql2);
                        stmt.executeQuery(sql3);
                        orderStock orst3 = new orderStock();
                        orst3.setVisible(true);//显示另一个界面
                        //同时隐藏登录界面
                        this.setVisible(false);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }


                }

        );

        contentPane.setPreferredSize(new Dimension(280, 300));

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
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
