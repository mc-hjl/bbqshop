package cn.edu.guet.weappdemo.menu;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 02 15:08:25 CST 2022
 */



/**
 * @author 1
 */
public class mainmenu extends JFrame {
    public mainmenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label30 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        textField1 = new JTextField("0");
        textField2 = new JTextField("0");
        textField3 = new JTextField("0");
        textField4 = new JTextField("0");
        textField5 = new JTextField("0");
        textField6 = new JTextField("0");
        textField7 = new JTextField("0");
        textField8 = new JTextField("0");
        textField9 = new JTextField("0");
        textField10 = new JTextField("0");
        textField11 = new JTextField("0");
        textField12 = new JTextField("0");
        textField13 = new JTextField("0");
        textField14 = new JTextField("0");
        textField15 = new JTextField("0");
        textField16 = new JTextField("0");
        button17 = new JButton();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();
        button21 = new JButton();
        button22 = new JButton();
        button23 = new JButton();
        button24 = new JButton();
        button25 = new JButton();
        button26 = new JButton();
        button27 = new JButton();
        button28 = new JButton();
        button29 = new JButton();
        button30 = new JButton();
        button31 = new JButton();
        button32 = new JButton();
        button33 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("      \u83dc    \u5355");
        contentPane.add(label1);
        label1.setBounds(385, 20, 85, 25);

        //---- label2 ----
        label2.setText("\u732a\u97ad\uff1a");
        contentPane.add(label2);
        label2.setBounds(70, 60, 55, label2.getPreferredSize().height);

        //---- label3 ----
        label3.setText("\u70e4\u7389\u7c73\uff1a");
        contentPane.add(label3);
        label3.setBounds(70, 90, 55, 17);

        //---- label4 ----
        label4.setText("\u9e21\u67f3\uff1a");
        contentPane.add(label4);
        label4.setBounds(70, 120, 55, 17);

        //---- label5 ----
        label5.setText("\u9c7c\u8c46\u8150\uff1a");
        contentPane.add(label5);
        label5.setBounds(70, 150, 55, 17);

        //---- label6 ----
        label6.setText("\u80a5\u725b\uff1a");
        contentPane.add(label6);
        label6.setBounds(70, 180, 55, 17);

        //---- label7 ----
        label7.setText("\u9999\u8106\u9e21\u76ae\uff1a");
        contentPane.add(label7);
        label7.setBounds(70, 210, 65, 17);

        //---- label8 ----
        label8.setText("\u6fb3\u6d32\u8089\u4e32\uff1a");
        contentPane.add(label8);
        label8.setBounds(70, 240, 70, 17);

        //---- label9 ----
        label9.setText("\u4e94\u82b1\u8089\uff1a");
        contentPane.add(label9);
        label9.setBounds(70, 270, 55, 17);

        //---- label10 ----
        label10.setText("4\u5143/\u4e32");
        contentPane.add(label10);
        label10.setBounds(new Rectangle(new Point(155, 60), label10.getPreferredSize()));

        //---- label11 ----
        label11.setText("7\u5143/\u4e32");
        contentPane.add(label11);
        label11.setBounds(new Rectangle(new Point(155, 90), label11.getPreferredSize()));

        //---- label12 ----
        label12.setText("3\u5143/\u4e32");
        contentPane.add(label12);
        label12.setBounds(new Rectangle(new Point(155, 120), label12.getPreferredSize()));

        //---- label13 ----
        label13.setText("3\u5143/\u4e32");
        contentPane.add(label13);
        label13.setBounds(new Rectangle(new Point(155, 150), label13.getPreferredSize()));

        //---- label14 ----
        label14.setText("3.5\u5143/\u4e32");
        contentPane.add(label14);
        label14.setBounds(new Rectangle(new Point(155, 180), label14.getPreferredSize()));
        //---- label15 ----
        label15.setText("3.5\u5143/\u4e32");
        contentPane.add(label15);
        label15.setBounds(new Rectangle(new Point(155, 210), label15.getPreferredSize()));

        //---- label16 ----
        label16.setText("3.5\u5143/\u4e32");
        contentPane.add(label16);
        label16.setBounds(new Rectangle(new Point(155, 240), label16.getPreferredSize()));

        //---- label17 ----
        label17.setText("4\u5143/\u4e32");
        contentPane.add(label17);
        label17.setBounds(new Rectangle(new Point(155, 270), label17.getPreferredSize()));

        //---- button1 ----
        button1.setText("-");
        contentPane.add(button1);
        button1.setBounds(215, 60, button1.getPreferredSize().width, 20);
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

        //---- button2 ----
        button2.setText("-");
        contentPane.add(button2);
        button2.setBounds(215, 90, button2.getPreferredSize().width, 20);
        button2.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField2.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField2.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button3 ----
        button3.setText("-");
        contentPane.add(button3);
        button3.setBounds(215, 120, button3.getPreferredSize().width, 20);
        button3.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField3.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField3.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button4 ----
        button4.setText("-");
        contentPane.add(button4);
        button4.setBounds(215, 150, button4.getPreferredSize().width, 20);
        button4.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField4.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField4.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button5 ----
        button5.setText("-");
        contentPane.add(button5);
        button5.setBounds(215, 180, button5.getPreferredSize().width, 20);
        button5.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField5.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField5.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button6 ----
        button6.setText("-");
        contentPane.add(button6);
        button6.setBounds(215, 210, button6.getPreferredSize().width, 20);
        button6.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField6.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField6.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button7 ----
        button7.setText("-");
        contentPane.add(button7);
        button7.setBounds(215, 240, button7.getPreferredSize().width, 20);
        button7.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField7.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField7.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button8 ----
        button8.setText("-");
        contentPane.add(button8);
        button8.setBounds(215, 270, button8.getPreferredSize().width, 20);
        button8.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField8.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField8.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- label18 ----
        label18.setText("\u70e4\u5c0f\u9992\u5934\uff1a");
        contentPane.add(label18);
        label18.setBounds(430, 60, 60, 17);

        //---- label19 ----
        label19.setText("\u9c7f\u9c7c\uff1a");
        contentPane.add(label19);
        label19.setBounds(430, 90, 55, 17);

        //---- label20 ----
        label20.setText("\u638c\u4e2d\u5b9d\uff1a");
        contentPane.add(label20);
        label20.setBounds(430, 120, 55, 17);

        //---- label21 ----
        label21.setText("\u52a0\u5dde\u8089\u4e32\uff1a");
        contentPane.add(label21);
        label21.setBounds(430, 150, 65, 17);

        //---- label22 ----
        label22.setText("\u9999\u80a0\uff1a");
        contentPane.add(label22);
        label22.setBounds(430, 180, 55, 17);

        //---- label23 ----
        label23.setText("\u9762\u7b4b\uff1a");
        contentPane.add(label23);
        label23.setBounds(430, 210, 55, 17);

        //---- label24 ----
        label24.setText("\u8c46\u8150\u7247\uff1a");
        contentPane.add(label24);
        label24.setBounds(430, 240, 55, 17);

        //---- label25 ----
        label25.setText("\u7f8a\u8089\u4e32\uff1a");
        contentPane.add(label25);
        label25.setBounds(430, 270, 55, 17);

        //---- label26 ----
        label26.setText("3\u5143/\u4e32");
        contentPane.add(label26);
        label26.setBounds(500, 60, 36, 17);

        //---- label27 ----
        label27.setText("4\u5143/\u4e32");
        contentPane.add(label27);
        label27.setBounds(500, 90, 36, 17);

        //---- label28 ----
        label28.setText("3.5\u5143/\u4e32");
        contentPane.add(label28);
        label28.setBounds(500, 120, 50, 17);

        //---- label29 ----
        label29.setText("3.5\u5143/\u4e32");
        contentPane.add(label29);
        label29.setBounds(500, 150, 50, 17);

        //---- label30 ----
        label30.setText("3\u5143/\u4e32");
        contentPane.add(label30);
        label30.setBounds(500, 180, 36, 17);

        //---- label31 ----
        label31.setText("3\u5143/\u4e32");
        contentPane.add(label31);
        label31.setBounds(500, 210, 36, 17);

        //---- label32 ----
        label32.setText("2\u5143/\u4e32");
        contentPane.add(label32);
        label32.setBounds(500, 240, 36, 17);

        //---- label33 ----
        label33.setText("3.5\u5143/\u4e32");
        contentPane.add(label33);
        label33.setBounds(500, 270, 50, 17);

        //---- button9 ----
        button9.setText("-");
        contentPane.add(button9);
        button9.setBounds(555, 60, button9.getPreferredSize().width, 20);
        button9.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField9.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField9.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button10 ----
        button10.setText("-");
        contentPane.add(button10);
        button10.setBounds(555, 90, button10.getPreferredSize().width, 20);
        button10.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField10.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField10.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button11 ----
        button11.setText("-");
        contentPane.add(button11);
        button11.setBounds(555, 120, button11.getPreferredSize().width, 20);
        button11.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField11.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField11.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button12 ----
        button12.setText("-");
        contentPane.add(button12);
        button12.setBounds(555, 150, button12.getPreferredSize().width, 20);
        button12.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField12.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField12.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button13 ----
        button13.setText("-");
        contentPane.add(button13);
        button13.setBounds(555, 180, button13.getPreferredSize().width, 20);
        button13.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField13.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField13.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button14 ----
        button14.setText("-");
        contentPane.add(button14);
        button14.setBounds(555, 210, button14.getPreferredSize().width, 20);
        button14.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField14.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField14.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button15 ----
        button15.setText("-");
        contentPane.add(button15);
        button15.setBounds(555, 240, button15.getPreferredSize().width, 20);
        button15.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField15.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField15.setText(String.valueOf(item_num));
                    }
                }
        );

        //---- button16 ----
        button16.setText("-");
        contentPane.add(button16);
        button16.setBounds(555, 270, button16.getPreferredSize().width, 20);
        button16.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField16.getText());
                    item_num=item_num-1;
                    if (item_num<0){
                        System.out.println("数量不合法");

                    }
                    else {
                        textField16.setText(String.valueOf(item_num));
                    }
                }
        );
        contentPane.add(textField1);
        textField1.setBounds(280, 60, 50, 20);
        contentPane.add(textField2);
        textField2.setBounds(280, 90, 50, 20);
        contentPane.add(textField3);
        textField3.setBounds(280, 120, 50, 20);
        contentPane.add(textField4);
        textField4.setBounds(280, 150, 50, 20);
        contentPane.add(textField5);
        textField5.setBounds(280, 180, 50, 20);
        contentPane.add(textField6);
        textField6.setBounds(280, 210, 50, 20);
        contentPane.add(textField7);
        textField7.setBounds(280, 240, 50, 20);
        contentPane.add(textField8);
        textField8.setBounds(280, 270, 50, 20);
        contentPane.add(textField9);
        textField9.setBounds(625, 60, 50, 20);
        contentPane.add(textField10);
        textField10.setBounds(625, 90, 50, 20);
        contentPane.add(textField11);
        textField11.setBounds(625, 120, 50, 20);
        contentPane.add(textField12);
        textField12.setBounds(625, 150, 50, 20);
        contentPane.add(textField13);
        textField13.setBounds(625, 180, 50, 20);
        contentPane.add(textField14);
        textField14.setBounds(625, 210, 50, 20);
        contentPane.add(textField15);
        textField15.setBounds(625, 240, 50, 20);
        contentPane.add(textField16);
        textField16.setBounds(625, 270, 50, 20);

        //---- button17 ----
        button17.setText("+");
        contentPane.add(button17);
        button17.setBounds(345, 60, button17.getPreferredSize().width, 20);
        button17.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField1.getText());
                    item_num=item_num+1;
                    textField1.setText(String.valueOf(item_num));
                }
        );

        //---- button18 ----
        button18.setText("+");
        contentPane.add(button18);
        button18.setBounds(345, 90, button18.getPreferredSize().width, 20);
        button18.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField2.getText());
                    item_num=item_num+1;
                    textField2.setText(String.valueOf(item_num));
                }
        );

        //---- button19 ----
        button19.setText("+");
        contentPane.add(button19);
        button19.setBounds(345, 120, button19.getPreferredSize().width, 20);
        button19.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField3.getText());
                    item_num=item_num+1;
                    textField3.setText(String.valueOf(item_num));
                }
        );

        //---- button20 ----
        button20.setText("+");
        contentPane.add(button20);
        button20.setBounds(345, 150, button20.getPreferredSize().width, 20);
        button20.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField4.getText());
                    item_num=item_num+1;
                    textField4.setText(String.valueOf(item_num));
                }
        );

        //---- button21 ----
        button21.setText("+");
        contentPane.add(button21);
        button21.setBounds(345, 180, button21.getPreferredSize().width, 20);
        button21.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField5.getText());
                    item_num=item_num+1;
                    textField5.setText(String.valueOf(item_num));
                }
        );

        //---- button22 ----
        button22.setText("+");
        contentPane.add(button22);
        button22.setBounds(345, 210, button22.getPreferredSize().width, 20);
        button22.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField6.getText());
                    item_num=item_num+1;
                    textField6.setText(String.valueOf(item_num));
                }
        );

        //---- button23 ----
        button23.setText("+");
        contentPane.add(button23);
        button23.setBounds(345, 240, button23.getPreferredSize().width, 20);
        button23.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField7.getText());
                    item_num=item_num+1;
                    textField7.setText(String.valueOf(item_num));
                }
        );

        //---- button24 ----
        button24.setText("+");
        contentPane.add(button24);
        button24.setBounds(345, 270, button24.getPreferredSize().width, 20);
        button24.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField8.getText());
                    item_num=item_num+1;
                    textField8.setText(String.valueOf(item_num));
                }
        );

        //---- button25 ----
        button25.setText("+");
        contentPane.add(button25);
        button25.setBounds(695, 60, button25.getPreferredSize().width, 20);
        button25.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField9.getText());
                    item_num=item_num+1;
                    textField9.setText(String.valueOf(item_num));
                }
        );

        //---- button26 ----
        button26.setText("+");
        contentPane.add(button26);
        button26.setBounds(695, 90, button26.getPreferredSize().width, 20);
        button26.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField10.getText());
                    item_num=item_num+1;
                    textField10.setText(String.valueOf(item_num));
                }
        );

        //---- button27 ----
        button27.setText("+");
        contentPane.add(button27);
        button27.setBounds(695, 120, button27.getPreferredSize().width, 20);
        button27.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField11.getText());
                    item_num=item_num+1;
                    textField11.setText(String.valueOf(item_num));
                }
        );

        //---- button28 ----
        button28.setText("+");
        contentPane.add(button28);
        button28.setBounds(695, 150, button28.getPreferredSize().width, 20);
        button28.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField12.getText());
                    item_num=item_num+1;
                    textField12.setText(String.valueOf(item_num));
                }
        );

        //---- button29 ----
        button29.setText("+");
        contentPane.add(button29);
        button29.setBounds(695, 180, button29.getPreferredSize().width, 20);
        button29.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField13.getText());
                    item_num=item_num+1;
                    textField13.setText(String.valueOf(item_num));
                }
        );

        //---- button30 ----
        button30.setText("+");
        contentPane.add(button30);
        button30.setBounds(695, 210, button30.getPreferredSize().width, 20);
        button30.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField14.getText());
                    item_num=item_num+1;
                    textField14.setText(String.valueOf(item_num));
                }
        );

        //---- button31 ----
        button31.setText("+");
        contentPane.add(button31);
        button31.setBounds(695, 240, button31.getPreferredSize().width, 20);
        button31.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField15.getText());
                    item_num=item_num+1;
                    textField15.setText(String.valueOf(item_num));
                }
        );

        //---- button32 ----
        button32.setText("+");
        contentPane.add(button32);
        button32.setBounds(695, 270, button32.getPreferredSize().width, 20);
        button32.addActionListener(
                e ->{
                    int item_num= Integer.parseInt(textField16.getText());
                    item_num=item_num+1;
                    textField16.setText(String.valueOf(item_num));
                }
        );

        //---- button33 ----
        button33.setText("\u53bb\u7ed3\u7b97\u2014\u2014>");
        contentPane.add(button33);
        button33.setBounds(360, 320, 160, button33.getPreferredSize().height);
        button33.addActionListener(

                e  -> {
                    String[] fields =
                            {
                                    textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText(), textField7.getText(), textField8.getText(), textField9.getText(),
                                    textField10.getText(), textField11.getText(), textField12.getText(), textField13.getText(), textField14.getText(), textField15.getText(), textField16.getText()
                            };
                    String[] lables1 =
                            {
                                    label2.getText(), label3.getText(),label4.getText(),label5.getText(),label6.getText(),label7.getText(),label8.getText(),label9.getText(),label18.getText(),label19.getText(),label20.getText(),label21.getText(),label22.getText(),
                                    label23.getText(),label24.getText(),label25.getText()
                            };
                    String[] lables2=
                            {
                                    label10.getText(),label11.getText(),label12.getText(),label13.getText(),label14.getText(),label15.getText(),label16.getText(),label17.getText(),label26.getText(),label27.getText(),label28.getText(),label29.getText()
                                    ,label30.getText(),label31.getText(),label32.getText(),label33.getText()
                            };
                    this.setVisible(false);

                    String sl=new String();
                    float expend = 0;
                    for (int i = 0; i < 16; i++) {
                        if (Integer.parseInt(fields[i]) > 0) {
                            sl =sl.concat(lables1[i]).concat("   ").concat(lables2[i]).concat("   ").concat(fields[i]).concat("串").concat("\r\n");
                            expend= expend+Integer.parseInt(fields[i])*Float.parseFloat((lables2[i].substring(0,lables2[i].length()-3)));
                        }
                        else
                        {

                        }
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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
