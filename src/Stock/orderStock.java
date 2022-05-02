package Stock;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * Created by JFormDesigner on Tue Apr 26 21:21:30 CST 2022
 */


/**
 * @author 1
 */
public class orderStock extends JFrame {
    private static String d="";

    //修改所需要显示的数值
    private static String xiugai1 ;
    private static String xiugai2;
    private static String xiugai3;
    private static String xiugai4;


    //获取的goods_id
    private static int hang;

    //传参的参数生成
    String a=d;
    String xiugai11=xiugai1;
    String xiugai22=xiugai2;
    String xiugai33 = xiugai3;
    String xiugai44=xiugai4;
    int hang1=hang;


    public void setA(String d){
        orderStock.d = d;
    }

    //获取修改框的值
    public void setxiugai1(String xiugai1){
        orderStock.xiugai1 = xiugai1;
    }
    public void setxiugai2(String xiugai2){
        orderStock.xiugai2 = xiugai2;
    }
    public void setxiugai3(String xiugai3){
        orderStock.xiugai3 = xiugai3;
    }
    public void setxiugai4(String xiugai4){
        orderStock.xiugai4 = xiugai4;
    }

    public void sethang(int hang){
        orderStock.hang = hang;
    }

    public orderStock() {
        initComponents();
    }


    private JScrollPane scrollPane1;
    private JTable table1;
    JTextField textField1;
    private String head[] = {"id", "商品名称", "单价", "库存"};
    private Object[][] data = null;
    private JButton button1;





    public static void main(String[] args) {
        new orderStock();
    }


    public void initComponents() {

        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";

        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
        button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();





        DefaultTableModel tableModel = new DefaultTableModel(queryData(), head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table1.setModel(tableModel);



        var contentPane = getContentPane();
        contentPane.setLayout(null);


        contentPane.add(textField1);
        textField1.setBounds(360, 345, 80, textField1.getPreferredSize().height);

        button1.setText("添加");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(80, 340), button1.getPreferredSize()));
        button1.addActionListener(
                e -> {
                    /*int index1 = table1.getSelectedRow();//获取选中行
                    int column1 = table1.getSelectedColumnCount();//获取选中列
                    System.out.println(table1.getValueAt(index1,column1));*/
                    inStock insk = new inStock();
                    insk.setVisible(true);//显示另一个界面
                    this.setVisible(false);//同时隐藏界面
                }
        );

        button2.setText("删除");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(150, 340), button2.getPreferredSize()));
        button2.addActionListener(
                e -> {
                    int index1 = table1.getSelectedRow();//获取选中行
                    int date1= (int) table1.getValueAt(index1, 0);

                    String sql="delete from StoreHouse where Goods_id = " + date1;
                    ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    Statement stmt = null;//语句对象，容易产生注入攻击
                    Connection conn = null;
                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);
                        stmt = conn.createStatement();
                        rs = stmt.executeQuery(sql);
                        orderStock orderStock =new orderStock();
                        orderStock.setVisible(true);
                        this.setVisible(false);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
        );

        button3.setText("修改");
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(220, 340), button3.getPreferredSize()));
        button3.addActionListener(
                e -> {

                    //获取选中的数值
                    int index1 = table1.getSelectedRow();//获取选中行
                    int column1 = table1.getSelectedColumnCount();//获取选中列
                    System.out.println(table1.getValueAt(index1,column1));

                    int a= index1+1;
                    sethang(a);
                    System.out.println(a);
                    String sql = "Select * From StoreHouse Where Goods_name="+"'"+table1.getValueAt(index1,column1)+"'";
                    System.out.println(sql);
                    ResultSet rs = null;//结果集：内存，存储了查询到的数据；内存区有一个游标，执行完查询的时候，不指向任何记录
                    Statement stmt = null;//语句对象，容易产生注入攻击
                    Connection conn = null;
                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);
                        stmt = conn.createStatement();
                        rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            setxiugai1(rs.getString(1));
                            setxiugai2(rs.getString(2));
                            setxiugai3(rs.getString(3));
                            setxiugai4(rs.getString(4));
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }


                    updateStock upsk = new updateStock();
                    upsk.setVisible(true);
                    this.setVisible(false);
                }
        );

        button4.setText("查询");
        contentPane.add(button4);
        button4.setBounds(new Rectangle(new Point(290, 340), button4.getPreferredSize()));
        button4.addActionListener(
                e -> {
                    d= textField1.getText();
                    setA(d);
                    serachStock search=new serachStock();
                    search.setVisible(true);
                    this.setVisible(false);
                }

        );



        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(45, 35, 415, 295);

        {

            Dimension preferredSize = new Dimension();
            for (int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    public Object[][] queryData() {

        java.util.List<Stockhouse> list = new ArrayList<Stockhouse>();
        Connection conn = null;
        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url="jdbc:oracle:thin:@139.9.192.221:1521:orcl";
        Statement stmt = null;//SQL语句对象，拼SQL
        String sql = "SELECT * FROM StoreHouse";
        String sql2 = "Select * From StoreHouse order by Goods_id";
        System.out.println("即将执行的sql：" + sql);
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, user, dbPassword);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql2);
            while (rs.next()) {
                //每循环一次就是一个对象，把这个对象放入容器（List（有序可重复）、Set（无序不可重复）、Map（key、value结构）
                Stockhouse stoh =new Stockhouse();
                stoh.setGoods_id(rs.getInt(1));
                stoh.setGoods_name(rs.getString(2));
                stoh.setGoods_price(rs.getFloat(3));
                stoh.setGoods_stock(rs.getInt(4));
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
                data[i][0] = list.get(i).getGoods_id();
                data[i][1] = list.get(i).getGoods_name();
                data[i][2] = list.get(i).getGoods_price();
                data[i][3] = list.get(i).getGoods_stock();
            }
        }
        return data;



    }
}
