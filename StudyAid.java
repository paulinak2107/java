package ModelOfEngine;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudyAid extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int RIGHT = 0;

	
public StudyAid() throws HeadlessException {
		
		super("Study Aid");
		setVisible(true);
		setSize(640,480);
		setLocation(600,100);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel p4=new JPanel();
		JPanel p3=new JPanel();
		add(p4,BorderLayout.NORTH);
		add(p3,BorderLayout.CENTER);
		
		p4.setLayout(new FlowLayout(RIGHT));
		JButton closeFrameButton = new JButton("Exit");
		p4.add(closeFrameButton);
		
		ActionListener closeListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {dispose();}};
		closeFrameButton.addActionListener(closeListener);
		
		JLabel information = new JLabel("coœ");
		p3.add(information);




		}


}
