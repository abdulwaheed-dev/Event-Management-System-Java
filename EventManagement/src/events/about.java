/*///////////////////////////////////////
Coder: Abdul Waheed Chachar
CMS ID: 021-19-0044
Class: BSCS-II, Section: A
Suukur IBA University 
*////////////////////////////////////////

package events;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

class about extends JFrame {
	
	private Color butt = new Color(240, 147, 43);
	private Font tf = new Font("Constantia",Font.PLAIN,18);
	private Color bac = new Color(47, 48, 52);
	private JLabel title,title1, menu,ends,ends1;
	private JButton close,backb;
	
	void buttonCustom(JButton b) {
		b.setFont(tf);
		b.setBackground(butt);
	    b.setForeground(Color.WHITE);
	    b.setFocusPainted(false);
	}
	
	about(){
		setName("About Us");
		getContentPane().setBackground(bac);
		setBounds(300,20,650,700);
		getRootPane().setBorder(new LineBorder(butt,5));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		title = new JLabel("Lenovo Event Records Management", SwingConstants.CENTER);
		title.setFont(new Font("Constantia",Font.PLAIN,30));
		title.setForeground(Color.white);
		title.setBounds(32,10,570,70);
		add(title);
		
		title1 = new JLabel("ABOUT US",SwingConstants.CENTER);
		title1.setFont(new Font("Constantia",Font.PLAIN,25));
		title1.setForeground(Color.white);
		title1.setBorder(new LineBorder(butt , 3));
		title1.setBounds(220,90,200,50);
		add(title1);
		
		JLabel info =new JLabel("<html>PROJECT : Event Management System<br><br>DEVELOPER :  Abdul Waheed Chachar<br><br>TEACHER : Ghulam Mujtaba<br><br>LANGUAGE :  Java<br><br>YEAR : 2019</html>");
		info.setFont(new Font("Microsoft JhengHei UI",Font.PLAIN,22));
		info.setForeground(Color.white);
		info.setBounds(120,160,410,290); 
		add(info);
		
		close = new JButton("CLOSE");
		buttonCustom(close);
		close.setBounds(330,490,150,50); 
		add(close);
		
		backb = new JButton("BACK");
		buttonCustom(backb);
		backb.setBounds(100,490,150,50);
		add(backb);
		
		ends = new JLabel("Lenovo Creations.",SwingConstants.RIGHT);
		ends.setFont(new Font("Constantia",Font.PLAIN,20));
		ends.setForeground(Color.white);
		ends.setBounds(22,620,600,40);
		add(ends);
		
		ends1 = new JLabel("All Rights Reserved.",SwingConstants.LEFT);
		ends1.setFont(new Font("Constantia",Font.PLAIN,20));
		ends1.setForeground(Color.white);
		ends1.setBounds(5,620,600,40);
		add(ends1);
		
		setVisible(true);
		
		backb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new frame();
			}
		}
		);
		close.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		);
	}
	
}