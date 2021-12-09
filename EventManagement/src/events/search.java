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


class search extends JFrame {
	
	EventRecord obj = new EventRecord();
	private Color butt = new Color(240, 147, 43);
	private Color bac = new Color(47, 48, 52);
	private Font tf = new Font("Constantia",Font.PLAIN,18);
	private JLabel name,title,title1,ends,ends1,result;
	private JButton search,backb,clear;
	private JTextArea sdata;

	void buttonCustom(JButton b) {
		b.setFont(tf);
		b.setBackground(butt);
	    b.setForeground(Color.WHITE);
	    b.setFocusPainted(false);
	}
	
	public void searchEvent (String n)
	{		
		for (int i = 0 ; i < obj.events.size () ; i++)
		{
			EventInfo e = (EventInfo) (obj.events.get (i)) ;
			if (n.equals (e.name))
			{
				e.Print (sdata) ;
			}
			else {
				sdata.setText("Sorry, Record Not Found!");
			}
		}
	}	

	search(){
		setTitle("Search Event Record");
		getContentPane().setBackground(bac);
		setBounds(300,20,650,700);
		getRootPane().setBorder(new LineBorder(butt,5));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		title = new JLabel("Search an Event Record", SwingConstants.CENTER);
		title.setFont(new Font("Constantia",Font.PLAIN,30));
		title.setForeground(Color.white);
		title.setBounds(10,10,620,70);
		add(title);
		
		title1 = new JLabel("Enter Event Name to Search",SwingConstants.CENTER);
		title1.setFont(new Font("Constantia",Font.PLAIN,25));
		title1.setForeground(Color.white);
		title1.setBorder(new LineBorder(butt , 3));
		title1.setBounds(160,80,330,45);
		add(title1);
		
		name = new JLabel("Name:");
		name.setFont(tf);
		name.setForeground(Color.white);
		name.setBounds(100,165,190,50);
		add(name);
		
		JTextField tname = new JTextField();
		tname.setFont(new Font("Arial",Font.PLAIN,18));
		tname.setBounds(220,165,260,35);
		add(tname);
		
		result = new JLabel ("Here are the results:",SwingConstants.CENTER);
		result.setFont(new Font("Constantia",Font.PLAIN,20));
		result.setBorder(new LineBorder(butt , 2));
		result.setForeground(Color.WHITE);
		result.setBounds(100,300,210,40);
		add(result);
		
		clear = new JButton("CLEAR");
		buttonCustom(clear);
		clear.setBounds(360,300,100,42); 
		add(clear);
		
		sdata = new JTextArea();
		sdata.setEditable(false);
		sdata.setFont(new Font("Arial",Font.PLAIN,18));
		sdata.setBorder(new LineBorder(butt,2));
		sdata.setForeground(Color.white);
		sdata.setBackground(bac);
		sdata.setBounds(100,360,400,220);
		add(sdata);
		
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
		
		search = new JButton("SEARCH");
		buttonCustom(search);
		search.setBounds(330,235,150,50); 
		add(search);
		
		backb = new JButton("BACK");
		buttonCustom(backb);
		backb.setBounds(100,235,150,50);
		add(backb);
	
		setVisible(true);
		
		backb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new frame();
			}
		}
		);
		search.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String ss = tname.getText();
				if(ss.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Type Event Name to Search.");
				}
				else{
					searchEvent(ss);	
				}
			}
		}
		);
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				tname.setText("");
				sdata.setText("");
			}
		}
		);
	}
}
