/*///////////////////////////////////////
Coder: Abdul Waheed Chachar
CMS ID: 021-19-0044
Class: BSCS-II, Section: A
Suukur IBA University 
*////////////////////////////////////////
package events;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*; 
import java.awt.event.*;
import java.io.* ;
import events.selectDate;
import events.Mainn;


class newEvent extends JFrame{
	
	EventRecord obj = new EventRecord();
	private Color bac = new Color(47, 48, 52);
	private Color butt = new Color(240, 147, 43);
	private Font tf = new Font("Constantia",Font.PLAIN,18);
	private JLabel title,ends,ends1,title1,time,name,Edate,venu,thours,tmin,tap;
	private JTextField tname; 
	private JTextArea tvenu; 
	private JCheckBox term; 
	private JButton sub;
	private JComboBox hour,min,ap;
	private String apm[] = {"AM" , "PM"};
	private String hours[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	private String minutes[] = { "00","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
	void buttonCustom(JButton b) {
		b.setFont(tf);
		b.setBackground(butt);
	    b.setForeground(Color.WHITE);
	    b.setFocusPainted(false);
	}
	
	newEvent ()
	{
		setTitle("Add New Event Record");
		getContentPane().setBackground(bac);
		setBounds(300,20,650,700);
		getRootPane().setBorder(new LineBorder(butt,5));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		title = new JLabel("Add a New Event Record", SwingConstants.CENTER);
		title.setFont(new Font("Constantia",Font.PLAIN,30));
		title.setForeground(Color.white);
		title.setBounds(32,10,570,70);
		add(title);
		
		title1 = new JLabel("Give Information below",SwingConstants.CENTER);
		title1.setFont(new Font("Constantia",Font.PLAIN,25));
		title1.setForeground(Color.white);
		title1.setBorder(new LineBorder(butt , 3));
		title1.setBounds(165,90,290,50);
		add(title1);
		
		name = new JLabel("Event Name:");
		name.setFont(tf);
		name.setForeground(Color.white);
		name.setBounds(100,160,190,50);
		add(name);
		
		tname = new JTextField();
		tname.setFont(new Font("Arial",Font.PLAIN,18));
		tname.setBounds(220,160,260,35);
		add(tname);
		
		Edate = new JLabel("Select Date:");
		Edate.setFont(tf);
		Edate.setForeground(Color.white);
		Edate.setBounds(100,220,170,50);
		add(Edate);
		
		JTextField text = new JTextField();
		text.setFont(new Font("Arial",Font.PLAIN,18));
		text.setEditable(false);
		text.setBounds(220,220,200,40);
		add(text);
		
		JButton b = new JButton("....");
		buttonCustom(b);
		b.setBounds(430,220,50,40);
		add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				JFrame ff = new JFrame();
				selectDate ddd = new selectDate(ff);
				String datee = ddd.setPickedDate();
				text.setText(datee);
				ff.setVisible(false);
			}
		});
		
		time = new JLabel("Set Time:");
		time.setFont(tf);
		time.setForeground(Color.white);
		time.setBounds(100,280,190,50);
		add(time);
		
		thours = new JLabel("Hours:");
		thours.setFont(new Font("Arial",Font.PLAIN,16));
		thours.setForeground(Color.white);
		thours.setBounds(220,270,70,20);
		add(thours);
		
		hour = new JComboBox(hours);
		hour.setFont(new Font("Arial",Font.PLAIN,18));
		hour.setToolTipText("Hours");
		hour.setBounds(220,290,70,30);
		add(hour);
		
		tmin = new JLabel("Minutes:");
		tmin.setFont(new Font("Arial",Font.PLAIN,16));
		tmin.setForeground(Color.white);
		tmin.setBounds(300,270,70,20);
		add(tmin);
		
		min = new JComboBox(minutes);
		min.setFont(new Font("Arial",Font.PLAIN,18));
		min.setToolTipText("Minutes");
		min.setBounds(300,290,70,30);
		add(min);
		
		tap  = new JLabel("AM/PM:");
		tap.setFont(new Font("Arial",Font.PLAIN,16));
		tap.setForeground(Color.white);
		tap.setBounds(380,270,70,20);
		add(tap);
		
		ap = new JComboBox(apm);
		ap.setFont(new Font("Arial",Font.PLAIN,18));
		ap.setBounds(380,290,70,30);
		add(ap);
		
		venu = new JLabel("Set Venu:");
		venu.setFont(tf);
		venu.setForeground(Color.white);
		venu.setBounds(100,340,190,50);
		add(venu);
		
		tvenu = new JTextArea();
		tvenu.setFont(new Font("Arial",Font.PLAIN,18));
		tvenu.setBounds(220,340,260,55);
		add(tvenu);
		
		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(tf);
		term.setBackground(bac);
		term.setForeground(Color.white);
		term.setFocusPainted(false);
		term.setBounds(170,425,275,35);
		add(term);
		
		sub = new JButton("ADD EVENT");
		buttonCustom(sub);
		sub.setBounds(100,490,150,50);
		add(sub);
		
		JButton backb = new JButton("BACK");
		buttonCustom(backb);
		backb.setBounds(330,490,150,50);
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
		                                                                                                                                  
		sub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				if (e.getSource() == sub) { 
					if (term.isSelected()) { 
						String name = tname.getText();  
						String dat = text.getText();
						String time = (String)hour.getSelectedItem() + ":" + (String)min.getSelectedItem() + ap.getSelectedItem();  
						String venu = tvenu.getText(); 
						if(name.equals("")|| dat.equals("")|| time.equals("")|| venu.equals("")) {
							JOptionPane.showMessageDialog(null,"Please provide complete information");
						}
						else {
							EventInfo evet = new EventInfo (name , dat , time,  venu) ;
							obj.events.add(evet);
							obj.saveEvents();
							JOptionPane.showMessageDialog(null, "Event Added Successfully..");
							setVisible(false);
							new frame();
						}
					} 
					else { 
						JOptionPane.showMessageDialog(null,"Please accept the terms & conditions.."); 
					} 
				} 
			}
		}
		);
		backb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new frame();
			}
		}
		);
	
	}
	
}
