package GUI;

import javax.swing.*;
import java.awt.*;

public class HousePanel extends JPanel{
	public void paintComponent(Graphics g){
		
		int houseX = 10;//Body's distance from the sides of frame
		int houseY = this.getHeight()/3;//Get the height of the panel, the height of the top of the body
		
		
		//Roof
		int[] x = {0,this.getWidth()/2,this.getWidth()};
		int[] y = {this.getHeight()/3,5,this.getHeight()/3};
		g.setColor(Color.darkGray);
		g.fillPolygon(x,y,3);
		
		//Body
		int houseWidth = getWidth()-(houseX*2);
		int houseHeight = getHeight()-50;	
		g.setColor(Color.YELLOW);
		g.fillRect(houseX,houseY,houseWidth,houseHeight);
		
		//Window & door
		int door = 50, window = 55;
		int windowInset = 20;//Window's distance from the sides of body	
		g.setColor(Color.darkGray);
		g.fillRect(houseX+windowInset, houseY+windowInset, window, window);
		g.fillRect(houseX+houseWidth-windowInset-window, houseY+windowInset, window, window);
		//Door
		g.fillRect(houseX+(houseWidth/2)-door/2, (houseHeight/2)+houseY+windowInset/2, door, 
				(houseHeight/2)-windowInset/2);
		
		
	}

}
