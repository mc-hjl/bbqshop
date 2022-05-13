package cn.edu.guet.weappdemo.menu;

import cn.edu.guet.weappdemo.Stock.Stockhouse;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/*
 * Created by JFormDesigner on Mon May 02 15:08:25 CST 2022
 */



/**
 * @author 1
 */
public class mainmenu extends JFrame {
    public mainmenu(String sql) {
        initComponents(sql);
    }
    String sl=new String();
    String sql1=sql;


    private void initComponents(String sql) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";

        JTextArea textarea1 = new JTextArea(sl);
        scrollPane1=new JScrollPane();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        textField1 = new JTextField("0");
        button17 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button33 = new JButton();
        table1 = new JTable();

        shopcar=new Object[1000][1000];

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- scrollPane1 ---- 显示菜单
        DefaultTableModel tableModel = new DefaultTableModel(queryData(sql1), head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(tableModel);
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(45, 80, 300, 300);

        //---- textField1 ---- 显示输入框(用于输入商品数量)
        contentPane.add(textField1);
        textField1.setBounds(175, 400, 50, 20);

        //---- textarea1 ---- 显示购物车(用于查看已经选中的商品)
        contentPane.add(textarea1);
        textarea1.setBounds(400, 80, 300, 300);
        textarea1.setText(sl);

        //---- label1 ---- 显示"菜单"二字
        label1.setText("      \u83dc    \u5355");
        contentPane.add(label1);
        label1.setBounds(160, 40, 85, 25);

        //---- label2 ---- 显示"购物车"三字
        label2.setText("购物车");
        contentPane.add(label2);
        label2.setBounds(500, 40, 85, 25);

        //---- button1 ---- 用于减少商品数量(未加入购物车时)
        button1.setText("-");
        contentPane.add(button1);
        button1.setBounds(130, 400, button1.getPreferredSize().width, 20);
        button1.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField1.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField1.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button17 ---- 用于增加商品数量(未加入购物车时)
        button17.setText("+");
        contentPane.add(button17);
        button17.setBounds(230, 400, button17.getPreferredSize().width, 20);
        button17.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField1.getText());
                    item_num=item_num+1;
                    textField1.setText(String.valueOf(item_num));
                }
        );

        //---- button2 ---- 用于添加商品到购物车中(包含商品名称，商品价格，数量)
        button2.setText("添加");
        contentPane.add(button2);
        button2.setBounds(280, 400, button2.getPreferredSize().width, 20);
        button2.addActionListener(
                e ->{
                    int inxh=0;
                    int jump=0;
                    while(shopcar[inxh][0]!=null){
                        if(shopcar[inxh][0]==String.valueOf(table1.getValueAt(table1.getSelectedRow(),0)))
                        {
                            shopcar[inxh][2]=(int) shopcar[inxh][2]+Integer.parseInt(textField1.getText());
                            System.out.println(shopcar[inxh][0]+","+shopcar[inxh][1]+","+shopcar[inxh][2]);
                            jump=1;
                            int i=0;
                            sl="";
                            while(shopcar[i][0]!=null) {
                                sl = sl.concat((String) shopcar[i][0]).concat("   ").concat(String.valueOf((float) shopcar[i][1])).concat("   ").concat(String.valueOf((int) shopcar[i][2])).concat("串").concat("\r\n");
                                i++;
                            }
                            textarea1.setText(sl);
                            break;
                        }
                        inxh++;
                    }
                    if(jump==0)
                    {
                    shopcar[inxh][0]=String.valueOf(table1.getValueAt(table1.getSelectedRow(),0));
                    shopcar[inxh][1]=Float.valueOf((Float) table1.getValueAt(table1.getSelectedRow(),1));
                    shopcar[inxh][2]=Integer.parseInt(textField1.getText());
                    System.out.println(shopcar[inxh][0]+","+shopcar[inxh][1]+","+shopcar[inxh][2]);
                        int i=0;
                        sl="";
                        while(shopcar[i][0]!=null) {
                            sl = sl.concat((String) shopcar[i][0]).concat("   ").concat(String.valueOf((float) shopcar[i][1])).concat("   ").concat(String.valueOf((int) shopcar[i][2])).concat("串").concat("\r\n");
                            i++;
                        }
                    textarea1.setText(sl);
                    }
                }
        );

        //---- button3 ---- 用于删除购物车中的商品
        button3.setText("删除");
        contentPane.add(button3);
        button3.setBounds(60, 400, button2.getPreferredSize().width, 20);
        button3.addActionListener(
                e ->{
                    int i=0;
                    while(shopcar[i][0]!=null){
                        if(shopcar[i][0]==String.valueOf(table1.getValueAt(table1.getSelectedRow(),0))){
                            int j=i;
                            if(shopcar[j+1][0]==null)
                            {
                                shopcar[j][0]=null;
                                shopcar[j][1]=null;
                                shopcar[j][2]=null;
                            }
                            while(shopcar[j+1][0]!=null){
                                shopcar[j][0]=(String)shopcar[j+1][0];
                                shopcar[j][1]=(float)shopcar[j+1][1];
                                shopcar[j][2]=(int)shopcar[j+1][2];
                                shopcar[j+1][0]=null;
                                shopcar[j+1][1]=null;
                                shopcar[j+1][2]=null;
                                j++;
                            }
                        }
                        i++;
                    }
                    i=0;
                    sl="";
                    while(shopcar[i][0]!=null) {
                        sl = sl.concat((String) shopcar[i][0]).concat("   ").concat(String.valueOf((float) shopcar[i][1])).concat("   ").concat(String.valueOf((int) shopcar[i][2])).concat("串").concat("\r\n");
                        i++;
                    }
                    textarea1.setText(sl);
                }
        );

        //---- button33 ---- 用于将购物车清单输出并统计
        button33.setText("\u53bb\u7ed3\u7b97\u2014\u2014>");
        contentPane.add(button33);
        button33.setBounds(560, 400, 160, button33.getPreferredSize().height);
        button33.addActionListener(

                e  -> {
                    this.setVisible(false);

                    float expend = 0;
                    int i=0;
                    sl="";
                    while(shopcar[i][0]!=null) {
                            sl =sl.concat((String)shopcar[i][0]).concat("   ").concat(String.valueOf((float)shopcar[i][1])).concat("   ").concat(String.valueOf((int)shopcar[i][2])).concat("串").concat("\r\n");
                            expend= expend+(int)shopcar[i][2]*(float)shopcar[i][1];
                            i++;
                    }
                    System.out.println(sl);
                    System.out.println(expend);
                    ordermenu odme=new ordermenu(sl,expend);
                    odme.setVisible(true);
                }
        );

        contentPane.setPreferredSize(new Dimension(885, 440));
        pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public Object[][] queryData(String sql1) {

        java.util.List<Stockhouse> list = new ArrayList<Stockhouse>();
        Connection conn = null;
        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url="jdbc:oracle:thin:@139.9.192.221:1521:orcl";
        Statement stmt = null;//SQL语句对象，拼SQL
        String sql2=null;
        if(sql1==""){
            sql2 = "Select Goods_name,Goods_price From StoreHouse order by Goods_name";
        }else{
            sql2=sql1;
        }



        System.out.println("即将执行的sql：" + sql2);
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, user, dbPassword);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql2);
            while (rs.next()) {
                //每循环一次就是一个对象，把这个对象放入容器（List（有序可重复）、Set（无序不可重复）、Map（key、value结构）
                Stockhouse stoh =new Stockhouse();
                stoh.setGoods_name(rs.getString(1));
                stoh.setGoods_price(rs.getFloat(2));
                list.add(stoh);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //释放资源：数据库连接很昂贵
            try {
                rs.close();
                stmt.close();
                conn.close();//关连接
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        data = new Object[list.size()][head.length];
        //把集合里的数据放入Obejct这个二维数组
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < head.length; j++) {
                data[i][0] = list.get(i).getGoods_name();
                data[i][1] = list.get(i).getGoods_price();
            }
        }
        return data;



    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JTextField textField1;
    private JButton button17;
    private JButton button2;
    private JButton button3;
    private JButton button33;
    private JScrollPane scrollPane1;
    private JTable table1;

    private String head[] = {"商品名称", "单价"};
    private Object[][] data = null;
    private Object[][] shopcar = null;
    private static String sql="";
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
