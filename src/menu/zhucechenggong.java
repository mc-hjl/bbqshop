/*
 * Created by JFormDesigner on Sat May 14 00:41:33 CST 2022
 */

package menu;

import Login.balogin;
import Login.relogin;

import java.awt.*;
import javax.swing.*;

/**
 * @author 1
 */
public class zhucechenggong extends JFrame {
    public zhucechenggong() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        zhuce zhuce1=new zhuce();
        String zhanghao=zhuce1.zhanghao1;//获得账号
        label1.setText("注册成功，您的账号为："+zhanghao);
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(120, 85),label1.getPreferredSize()));

        //---- button1 返回----
        button1.setText("\u8fd4\u56de");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(165, 165), button1.getPreferredSize()));
        button1.addActionListener(
                e -> {
                    this.setVisible(false);
                    relogin relogin1 = new relogin();
                    relogin1.setVisible(true);
                }
        );
        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
