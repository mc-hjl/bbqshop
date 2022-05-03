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
public class  serachStock extends JFrame {


    public serachStock() {
        initComponents();
    }

    private JScrollPane scrollPane1;
    private JTable table1;
    private String head[] = {"id", "商品名称", "单价", "库存"};
    private Object[][] data = null;
    private JButton button1;
    String user = "zsx";
    String dbPassword = "zsx1234GuEt";
    String url = "jdbc:oracle:thin:@139.9.192.221:1521:orcl";


    //判断输入为整型还是字符串类型
    public boolean panduan(String a){
        try{

            double d2 = Double.parseDouble(a);
            String sql2 = "SELECT * FROM StoreHouse WHERE Goods_price = "+d2;
            Connection conn = DriverManager.getConnection(url, user, dbPassword);
            Statement stmt = conn.createStatement();

            ResultSet rs2 = stmt.executeQuery(sql2);
        } catch (Exception e) {
            System.out.println(a);
            return  false;
        }
        return true;
    }


    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new serachStock();
    }


    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);//设置组件可见

        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //       JTextField textField1 = new JTextField();
        button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        orderStock orst = new orderStock("");
        String d = orst.a;
        DefaultTableModel tableModel = new DefaultTableModel(queryData(d), head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table1.setModel(tableModel);


        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);


//        contentPane.add(textField1);
//        textField1.setBounds(360, 345, 80, textField1.getPreferredSize().height);

    /*    button1.setText("添加");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(80, 340), button1.getPreferredSize()));
        button1.addActionListener(
                e -> {
                    /*int index1 = table1.getSelectedRow();//获取选中行
                    int column1 = table1.getSelectedColumnCount();//获取选中列
                    System.out.println(table1.getValueAt(index1,column1));*/

//                    tjjm tj = new tjjm();
//                    tj.setVisible(true);//显示另一个界面
        ///                  this.setVisible(false);//同时隐藏登录界面
        //               }
        //       );

 /*       button2.setText("删除");
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
                        ChaXun chaxun=new ChaXun();
                        chaxun.setVisible(true);
                        this.setVisible(false);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
        );

*/
        button3.setText("返回");
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(220, 340), button3.getPreferredSize()));
        button3.addActionListener(
                e -> {
                    orderStock a= new orderStock("");
                    a.setVisible(true);
                    this.setVisible(false);
                }
        );

/*        button4.setText("查询");
        contentPane.add(button4);
        button4.setBounds(new Rectangle(new Point(290, 340), button4.getPreferredSize()));
        button4.addActionListener(
                e -> {
                    Main a= new Main();
                    a.setVisible(true);
                    this.setVisible(false);

                }
        );*/

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(45, 35, 415, 295);

        {
            // compute preferred size
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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public Object[][] queryData(String a) {

        java.util.List<Stockhouse> list = new ArrayList<Stockhouse>();
        Connection conn = null;
        String user = "zsx";
        String dbPassword = "zsx1234GuEt";
        String url="jdbc:oracle:thin:@139.9.192.221:1521:orcl";
        Statement stmt = null;//SQL语句对象，拼SQL
        String b=a;

        boolean panduan =panduan(a);
        String sql="";
        if(panduan==true){
            float d= Float.parseFloat(a);
            sql = "SELECT * FROM StoreHouse WHERE Goods_id = "+d+"or Goods_price="+d+"or Goods_stock="+d;
        }
        else{
            sql = "SELECT * FROM StoreHouse WHERE Goods_name = "+"'"+b+"'";
        }
        System.out.println("即将执行的sql：" + sql);
        String sql2 = "Select * From "+"("+sql+")"+" order by Goods_id";
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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables

}
