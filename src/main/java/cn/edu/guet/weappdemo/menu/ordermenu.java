package cn.edu.guet.weappdemo.menu;

import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 02 18:52:37 CST 2022
 */



/**
 * @author 1
 */
public class ordermenu extends JFrame {
    String sl;
    Float expend;
    public ordermenu(String sl, float expend) {
        this.sl=sl;
        this.expend=expend;
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        JTextArea textarea1 = new JTextArea(sl);
        label1 = new JLabel();
        label2 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(textarea1);
        textarea1.setBounds(200, 50, 300, 300);
        textarea1.setText(sl);



        //---- label1 ----
        label1.setText("                          \u8d2d\u7269\u5355");
        contentPane.add(label1);
        label1.setBounds(275, 25, 225, 25);

        //---- label2 ----
        label2.setText("\u603b\u4ef7\uff1a");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(245, 385), label2.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(465, 385, 60, textField2.getPreferredSize().height);
        textField2.setText(String.valueOf(expend));

        //---- button1 ----
        button1.setText("\u786e\u8ba4\u652f\u4ed8\uff08\u5fae\u4fe1\u652f\u4ed8\uff09");
        contentPane.add(button1);
        button1.setBounds(355, 470, 165, 55);

        contentPane.setPreferredSize(new Dimension(905, 615));
        pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextArea textarea1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
