package GUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawingPanel extends JPanel{
	
	//When paintComponent() method exists,
	//setBackground(Color.RED) will be omitted
	public MyDrawingPanel(){
		this.setBackground(Color.RED);
		this.add(new JButton());
	}
	
	//Override the method in JPanel class
	//This method will be call implicitly by JVM,not by the progammer
	//,once the class is instatiated, 
	public void paintComponent(Graphics g){
		
		g.setColor(Color.RED);
		g.fillRect(50,50,80,50);
		
		g.setColor(Color.BLACK);
		g.drawString("This is drawString();",50,120);
		
		g.setColor(Color.CYAN);
		g.drawRect(50, 140, 80, 50);
		g.drawOval(50,140,80,50);
		
		g.setColor(Color.ORANGE);
		g.fillOval(50,200,80,50);
		
		g.setColor(Color.BLACK);
		g.drawArc(50, 260, 80, 50, 0, 180);
		
		g.setColor(Color.GRAY);
		g.fillArc(50, 290, 80, 50, 0, 180);
		
		//Polygon
		//The points must be add by order
		Polygon myPentagon = new Polygon();
		myPentagon.addPoint(250,50);
		myPentagon.addPoint(300,50);
		myPentagon.addPoint(220,100);
		myPentagon.addPoint(330,100);
		myPentagon.addPoint(275,150);
		g.drawPolygon(myPentagon);
		
		Polygon myPentagon2 = new Polygon();
		myPentagon2.addPoint(250,200);
		myPentagon2.addPoint(300,200);
		myPentagon2.addPoint(330,250);
		myPentagon2.addPoint(275,300);
		myPentagon2.addPoint(220,250);
		g.drawPolygon(myPentagon2);
		
		int[] X = {250,300,330,275,220};
		int[] Y = {200,200,250,300,250};
		g.drawPolygon(X,Y,5);
		
		g.setColor(Color.PINK);
		g.draw3DRect(400,50,80,50,true);
		
		Color myColor = new Color(255,50,100);//RGB
		g.setColor(myColor);
		g.fill3DRect(400,150,80,50,true);
		g.drawString("R:"+myColor.getRed(),400,210);
		g.drawString("G:"+myColor.getGreen(),400,225);
		g.drawString("B:"+myColor.getBlue(),400,240);
		
	}
}
