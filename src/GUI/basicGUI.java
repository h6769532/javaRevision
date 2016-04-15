package GUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class basicGUI extends JFrame{
	
	public basicGUI(){
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(3,3,3,3));
		this.setSize(450, 450);
		
		
		for(int i = 0;i<9;i++)
			this.getContentPane().add(new JButton(""+i));
	}
	
	public static void main(String args[]){
		new basicGUI();
	}

}