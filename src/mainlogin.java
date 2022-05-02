import java.awt.*;
import java.sql.*;
import javax.swing.*;

import Login.*;
/*
 * Created by JFormDesigner on Tue May 03 02:45:36 CST 2022
 */



/**
 * @author 1
 */
public class mainlogin extends JFrame {
    public mainlogin() {
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

        //---- label1 ----
        label1.setText("\u8001\u540c\u5b66\u70e7\u70e4\u5e97");
        label1.setForeground(new Color(255, 51, 51));
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
        contentPane.add(label1);
        label1.setBounds(180, 40, 225, 115);

        //---- button1 ----
        button1.setText("\u524d\u53f0\u767b\u5f55");
        contentPane.add(button1);
        button1.setBounds(225, 150, 120, 55);

        //---- button2 ----
        button2.setText("\u540e\u53f0\u767b\u5f55");
        contentPane.add(button2);
        button2.setBounds(225, 225, 120, 55);

        contentPane.setPreferredSize(new Dimension(580, 420));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.addActionListener(
                e -> {
                    relogin re=new relogin();
                    re.setVisible(true);
                    this.setVisible(false);
                }
        );
        button2.addActionListener(
                e -> {
                    balogin ba=new balogin();
                    ba.setVisible(true);
                    this.setVisible(false);
                }
        );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);//设置组件可见
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new mainlogin();
    }
}
