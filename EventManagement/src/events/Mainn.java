/*///////////////////////////////////////
Coder: Abdul Waheed Chachar
CMS ID: 021-19-0044
Class: BSCS-II, Section: A
Suukur IBA University 
*////////////////////////////////////////
package events;
import javax.swing.*;
import java.util.*;
import java.util.Timer;
import java.awt.*;
import java.io.* ;
import java.awt.event.*;
import javax.swing.border.LineBorder;

class EventInfo{
	String name , date , time , venue ;
	public EventInfo (){
		name = "" ;	date = "" ; time = "" ; venue = "" ;}
	public EventInfo (String name , String date , String time , String venue){
		this.name = name ; this.date = date ; this.time = time ;
		this.venue = venue ;}
	void Print (JTextArea gg){
		String event = name+","+date+","+time+","+venue; gg.setText(event);}}
class EventRecord{
	ArrayList events ;
	EventRecord (){
		events = new ArrayList() ;	loadEvents (); }
	public void saveEvents (){
		try {
			EventInfo e; String line;
			FileWriter fw = new FileWriter("Events.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(int i=0; i<events.size(); i++){
				e = (EventInfo)events.get(i);
				line = e.name +","+ e.date +","+e.time+"," +e.venue;
				// writes line to file (events.txt)
				pw.println(line);}
			pw.flush(); pw.close(); fw.close(); }
			catch(IOException ioEx){
				System.out.println(ioEx); } }
	public void loadEvents (){
		String tokens[] = null; String name, date, time, venue;
		try {
			FileReader fr = new FileReader("Events.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while ( line != null ) {
			tokens = line.split(",");
			name = tokens[0]; date = tokens[1];
			time = tokens[2]; venue = tokens[3];
			EventInfo p = new EventInfo(name, date,time , venue);
			events.add(p); line = br.readLine();}
		br.close(); fr.close(); }
		catch(IOException ioEx) {
			JOptionPane.showMessageDialog(null,ioEx); } } }
class frame extends JFrame{	
	EventRecord obj = new EventRecord();
	private Color butt = new Color(240, 147, 43);
	private Color bac = new Color(47, 48, 52);
	private Font tf = new Font("Constantia",Font.PLAIN,18);
	private JLabel title, menu,ends,ends1;
	void buttonCustom(JButton b) {
		b.setFont(tf); b.setBackground(butt); 
		b.setForeground(Color.WHITE); b.setFocusPainted(false);}
	frame(){
		setTitle("Lenovo Event Records");
		getContentPane().setBackground(bac);
		getRootPane().setBorder(new LineBorder(butt,5));
		setBounds(300,20,650,700); setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		title = new JLabel("Lenovo Event Records Management", SwingConstants.CENTER);
		title.setFont(new Font("Constantia",Font.PLAIN,35));
		title.setForeground(Color.white);
		title.setBounds(28,20,570,70);
		add(title);
		
		menu = new JLabel("MENU",SwingConstants.CENTER);
		menu.setFont(new Font("Constantia",Font.PLAIN,25));
		menu.setForeground(Color.white);
		menu.setBorder(new LineBorder(butt , 4));
		menu.setBounds(150,120,320,50);
		add(menu);
		
		JButton btn1 = new JButton("Add Event");
		btn1.setBounds(90,230,190,50);
		buttonCustom(btn1);
		add(btn1);
		
		JButton btn2 = new JButton("Show All Events");
		btn2.setBounds(90,310,190,50);
		buttonCustom(btn2);
		add(btn2);
		
		JButton btn3 = new JButton("ABOUT");
		btn3.setBounds(90,388,190,50);
		buttonCustom(btn3);
		add(btn3);
		
		JButton btn4 = new JButton("Search Event");
		btn4.setBounds(330,230,190,50);
		buttonCustom(btn4);
		add(btn4);
		
		JButton btn5 = new JButton("Delete Event");
		btn5.setBounds(330,310,190,50);
		buttonCustom(btn5);
		add(btn5);
		
		JButton btn6 = new JButton("EXIT");
		btn6.setBounds(330,388,190,50);
		buttonCustom(btn6);
		add(btn6);
		
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
		
		btn1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new newEvent();
			}
			}	
		);
		btn2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new displayAll();
		}
		}	
		);
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new about();
			}
		}	
		);
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new search();
			}
		}	
		);
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new delete();
			}
		}	
		);
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				obj.saveEvents();
				System.exit(0);
			}
		}	
		);
		
	}

}
public class Mainn
{
public static void main(String args[])
{
	new frame();
}
}