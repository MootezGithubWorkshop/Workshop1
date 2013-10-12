import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddingIconJLabel extends JFrame {
  public AddingIconJLabel() throws HeadlessException {
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    Icon icon = new ImageIcon("canada.png");
    JLabel label1 = new JLabel("Full Name :", icon, JLabel.LEFT);

    JLabel label2 = new JLabel("Address :", JLabel.LEFT);
    label2.setIcon(new ImageIcon("france.jpg"));

    getContentPane().add(label1);
    getContentPane().add(label2);
  }

  public static void main(String[] args) {
    new AddingIconJLabel().setVisible(true);
  }
}