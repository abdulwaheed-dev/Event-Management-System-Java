/*///////////////////////////////////////
Coder: Abdul Waheed Chachar
CMS ID: 021-19-0044
Class: BSCS-II, Section: A
Suukur IBA University 
*////////////////////////////////////////
package events;
import java.awt.*;
import java.awt.event.*;
import java.io.* ;
import javax.swing.*;
import javax.swing.border.LineBorder;

class displayAll extends JFrame {
	
	EventRecord obj = new EventRecord();
	private Color butt = new Color(240, 147, 43);
	private Color bac = new Color(47, 48, 52);
	private Font tf = new Font("Constantia",Font.PLAIN,18);
	private JLabel title, ends,ends1;
	private JButton backb;
	private JTextArea pdata;
	
	void buttonCustom(JButton b) {
		b.setFont(tf);
		b.setBackground(butt);
	    b.setForeground(Color.WHITE);
	    b.setFocusPainted(false);
	}
	
	void showEvents(){
		try{
	       		FileReader fr = new FileReader("Events.txt");
	       		BufferedReader br = new BufferedReader(fr);
	       		pdata.read(br, null);
	       		br.close();
		}
		catch(Exception e){
	    		JOptionPane.showMessageDialog(null, (e));
		}
	}
	
	displayAll(){
		setTitle("Display All Events");
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
		
		JButton click = new JButton("Click to Display All Events");
		buttonCustom(click);
		click.setBounds(165,100,300,50);
		add(click);
		
		pdata = new JTextArea();
		pdata.setEditable(false);
		pdata.setBackground(bac);
		pdata.setForeground(Color.white);
		pdata.setBorder(new LineBorder(butt,2));
		pdata.setFont(new Font("Arial",Font.PLAIN,18));
		pdata.setBounds(100,180,420,340);
		add(pdata);
		
		backb = new JButton("BACK");
		buttonCustom(backb);
		backb.setBounds(240,540,150,50);
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
		click.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				showEvents();
			}
		}
		);
	}
	
}
