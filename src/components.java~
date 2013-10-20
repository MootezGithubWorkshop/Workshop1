/*
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.*;
public class components extends JFrame {

	/*
	 * private JLabel item1;
	 * 
	 * public components(){ super("my first window"); setLayout(new
	 * FlowLayout()); item1 = new JLabel("my first label");
	 * item1.setToolTipText("survol text"); add(item1); }
	 */
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField password;

	private JButton button1;
	private JButton button2;
	
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public components() {
		super("action event");
		setLayout(new FlowLayout());

		item1 = new JTextField(10);
		add(item1);
		item2 = new JTextField("enter the text here",25);
		add(item2);
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		password = new JPasswordField("mypass");
		add(password);
		
		button1 = new JButton("mootez");
		button1.setSize(10,5);
		add(button1);
		//Icon btux = new ImageIcon(getClass().getResource("black_tux.png"));
		//Icon ptux = new ImageIcon(getClass().getResource("pink_tux.png"));

		button2 = new JButton("ahmed"/*,btux*/);
		button2.setSize(20,10);

		//button2.setRolloverIcon(ptux);
		add(button2);
		

	/*	thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		password.addActionListener(handler);
		button1.addActionListener(handler);
		button2.addActionListener(handler);
	*/
		pb = new JRadioButton("Plain",true);
		bb = new JRadioButton("Bold",false);
		ib = new JRadioButton("Italic",false);
		bib = new JRadioButton("Bold and Italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif",Font.PLAIN, 14);
		bf = new Font("Serif",Font.BOLD, 14);
		itf = new Font("Serif",Font.ITALIC, 14);
		bif = new Font("Serif",Font.BOLD + Font.ITALIC, 14);
		
		
		pb.addItemListener(new thehandler(pf));
		bb.addItemListener(new thehandler(bf));
		ib.addItemListener(new thehandler(itf));
		bib.addItemListener(new thehandler(bif));
	
		setSize(400, 200);
		setVisible(true);
		
	}

	private class thehandler implements ItemListener/*ActionListener*/ {

		/*
		 public void actionPerformed(ActionEvent event) {
			String string = "";
			if (event.getSource() == item1)
				string = String.format("field 1: %s", event.getActionCommand());
			else if (event.getSource() == item2)
				string = String.format("field 2: %s", event.getActionCommand());
			else if (event.getSource() == item3)
				string = String.format("field 3: %s", event.getActionCommand());
			else if (event.getSource() == password)
				string = String.format("password field is: %s",
						event.getActionCommand());
		 */
			/*
			JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
			*/
		
			private Font font;
			public thehandler(Font f){
				font = f;		
			}
			public void itemStateChanged(ItemEvent event){
				item2.setFont(font);
			}
	}

}
