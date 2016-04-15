package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	
	//Step 1. Create the frame
	public MyFrame(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(550, 400);
		
		//Step 2. Add the drawing panel
		this.getContentPane().add(new HousePanel());
		
	}
	
	public static void main(String args[]){
		new MyFrame();
	}

}
