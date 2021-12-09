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


class delete extends JFrame {
	
	EventRecord obj = new EventRecord();
	private Color butt = new Color(240, 147, 43);
	private Color bac = new Color(47, 48, 52);
	private Font tf = new Font("Constantia",Font.PLAIN,18);
	private JLabel name,title,title1,ends,ends1;
	private JButton delete,backb;
	
	void buttonCustom(JButton b) {
		b.setFont(tf);
		b.setBackground(butt);
	    b.setForeground(Color.WHITE);
	    b.setFocusPainted(false);
	}
	
	public void deleteEvent (String n)
	{
		boolean flag = false;
		for (int i = 0 ; i < obj.events.size () ; i++)
		{
			EventInfo e = (EventInfo) (obj.events.get (i)) ;
			if (n.equals (e.name))
			{
				obj.events.remove (i) ;
				flag = true;
			}
		}
		if(flag==true) {
			JOptionPane.showMessageDialog(null, "Record Deleted Successfully..");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, Record Not Found");
		}
	
	}

	delete(){
		setTitle("Delete Event Record");
		getContentPane().setBackground(bac);
		setBounds(300,20,650,700);
		getRootPane().setBorder(new LineBorder(butt,5));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		title = new JLabel("Delete an Event Record", SwingConstants.CENTER);
		title.setFont(new Font("Constantia",Font.PLAIN,30));
		title.setForeground(Color.white);
		title.setBounds(8,40,620,70);
		add(title);
		
		title1 = new JLabel("Enter Event Name to Delete",SwingConstants.CENTER);
		title1.setFont(new Font("Constantia",Font.PLAIN,25));
		title1.setForeground(Color.white);
		title1.setBorder(new LineBorder(butt , 3));
		title1.setBounds(165,140,330,50);
		add(title1);
		
		name = new JLabel("Name:");
		name.setFont(tf);
		name.setForeground(Color.white);
		name.setBounds(100,250,190,50);
		add(name);
		
		JTextField tname = new JTextField();
		tname.setFont(new Font("Arial",Font.PLAIN,18));
		tname.setBounds(220,250,260,35);
		add(tname);
		
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
		
		delete = new JButton("DELETE");
		buttonCustom(delete);
		delete.setBounds(330,360,150,50); 
		add(delete);
		
		backb = new JButton("BACK");
		buttonCustom(backb);
		backb.setBounds(100,360,150,50);
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
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String ff = tname.getText();
				if(ff.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Type Event Name to Delete.");
				}
				else {
					deleteEvent(ff);
					obj.saveEvents();
				}
				
			}
		}
		);
	}
}
