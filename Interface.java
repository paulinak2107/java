package ModelOfEngine;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Interface extends JFrame {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public Interface() throws HeadlessException 
		{
		super("Model of engine");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		setSize(740,600);
		setLocation(5,5);
		setLayout(new BorderLayout());
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		add(p2,BorderLayout.CENTER);
		add(p1,BorderLayout.WEST);
		add(p3,BorderLayout.EAST);
		add(p4,BorderLayout.NORTH);
		p1.add(new JLabel("Animation"));
		p2.add(new JLabel("Plot"));
	    
		p3.setLayout(new GridLayout(13, 1,10,10));
		String[] language = {"Polish", "English",};
		JList<String> chooselanguage = new JList<String>(language);
		p3.add(chooselanguage);
		
		String[] description = { "Choose of cycle","OTTO", "CARNOT"};
		JComboBox<String> comboBox = new JComboBox<String>(description);
		p3.add(comboBox);
		
		JButton b1 =new JButton("ON ");
		p3.add(b1);
		
		JButton b2 =new JButton("Pause");
		p3.add(b2);
		
		JButton b3 =new JButton("Stop");
		p3.add(b3);
		
		JButton b4 =new JButton("Save");
		p3.add(b4);
		JButton b5 =new JButton("Study aid");
		p3.add(b5);
		
		JButton b6 =new JButton("Exit");
		p3.add(b6);
		
		
	
		ActionListener studyAid = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			StudyAid abc=new StudyAid();
			abc.setVisible(true);
			}
		};
		b5.addActionListener(studyAid);
		
		
		ActionListener exitListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {System.exit(1);}};
		b6.addActionListener(exitListener);
		
	
		JLabel explorecycle = new JLabel();
		comboBox.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e){
	        	int nr_description = comboBox.getSelectedIndex();
	        	 if(nr_description==0){
                
                 explorecycle.setText("");}
                 if(nr_description==1){
                
                explorecycle.setText("OTTO");}
                 if(nr_description==2){
                	 explorecycle.setText("CARTON");
                	 
	        	 }  	
	        }});
		
		p4.add(explorecycle);
		
		
		
		
		
		
		
	
	        }
	
	
	public static void main( String[] args) 
		{
		
		   Interface frame =new Interface();
		   	frame.setVisible(true);
		
		}
	
}