package Stock;

import com.sun.tools.javac.Main;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 02 00:20:41 CST 2022
 */



/**
 * @author 1
 */
public class inStock extends JFrame {
    public inStock() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        //用于获得最后一行信息的ID
        orderStock orderstock2=new orderStock("");
        String name=orderstock2.name1;
        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";
        String SQL="select Goods_id from StoreHouse order by Goods_id ";
        System.out.println(SQL);
        System.out.println("SQL为:"+SQL);
        Statement STMT=null;
        ResultSet RT=null;
        Connection CONN = null;
        try {
            CONN = DriverManager.getConnection(url, user, dbPassword);
            STMT = CONN.createStatement();
            RT=STMT.executeQuery(SQL);
            String ID="";
            while (RT.next()) {
                ID=RT.getString(1);//得到所需要的ID
            }
            int id1= Integer.parseInt(ID);
            String ID2= String.valueOf(id1+1);
            textField1 = new JTextField(ID2);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        label1 = new JLabel();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField("100");
        button1 = new JButton();
        button2 = new JButton();

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
        button1.setText("\u6dfb\u52a0");
        contentPane.add(button1);
        button1.setBounds(100, 260, 105, button1.getPreferredSize().height);
        button1.addActionListener(
                e -> {
                    this.setVisible(false);
                    /*int index1 = table1.getSelectedRow();//获取选中行
                    int column1 = table1.getSelectedColumnCount();//获取选中列
                    System.out.println(table1.getValueAt(index1,column1));*/

                    Connection conn = null;
                    // 拼sql，容易有注入攻击
                    String sql = "Insert Into StoreHouse Values("+textField1.getText()+",'"+textField2.getText()+"',"+textField3.getText()+","+textField4.getText()+")";
                    String sql2 = "select * from StoreHouse order by Goods_id";
                    System.out.println(sql);
                    ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    ResultSet rs2 = null;//结果集：内1存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    Statement stmt = null;//语句对象，容易产生注入攻击
                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);
                        stmt = conn.createStatement();
                        rs=stmt.executeQuery(sql);
                        try {
                            rs2 = stmt.executeQuery(sql2);
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                        orderStock orst = new orderStock("");
                        orst.setVisible(true);//显示另一个界面
                        //同时隐藏登录界面

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }


                }

        );

        //返回键
        button2.setText("返回");
        contentPane.add(button2);
        button2.setBounds(10, 5, button2.getPreferredSize().width, 25);
        button2.addActionListener(
                e -> {
                    try{
                        this.setVisible(false);
                        orderStock orderstock =new orderStock("");
                        orderstock.setVisible(true);

                    } catch (Exception exception) {
                        exception.printStackTrace();
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
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}