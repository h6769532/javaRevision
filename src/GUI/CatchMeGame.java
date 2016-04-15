package GUI;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CatchMeGame extends JFrame{
	
	private JFrame myFrame;
	private int num=3;
	private GameButton[] button = new GameButton[num*num]; 
	private int trap;
	private PositionListener lsnr;
	
	public CatchMeGame(){
		
		myFrame = new JFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myFrame.setSize(400,300);
		myFrame.setTitle("Catch Me If You Can");
		
		lsnr = new PositionListener();
		
		this.setPanel(-1);
	}
	
	public void setPanel(int position){
		//myFrame.removeAll();
		int activate = (int)(Math.random()*9);
		while(activate == position)
			activate = (int)(Math.random()*9);
		System.out.println(activate);
		
		JPanel myPanel;
		myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(num,num,3,3));
		myFrame.getContentPane().add(myPanel);
		
		for(int i=0;i<num*num;i++){
			button[i] = new GameButton();
			button[i].setPosition(i);
			button[i].ifClick = false;
			myPanel.add(button[i]);
			if(i == activate){
				button[i].addMouseListener(lsnr);
				button[i].setText("Click me!");
			}
				
		}
	}
	
	public class PositionListener implements MouseListener{
		public void mouseEntered(MouseEvent e){
			GameButton eventsource = (GameButton)e.getSource();
			
			int position = eventsource.getPosition();
			
			button[position].removeMouseListener(lsnr);
			
			int activate = (int)(Math.random()*9);
			while(activate == position)
				activate = (int)(Math.random()*9);
			
			for(int i=0;i<num*num;i++){
				button[i].setText("");
				button[i].ifClick = false;
				if(i == activate){
					button[i].addMouseListener(lsnr);
					button[i].setText("Click me!");
				}
			}
		}
		

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public class GameButton extends JButton{
		private int position;
		private boolean ifClick;

		public boolean isIfClick() {
			return ifClick;
		}

		public void setIfClick(boolean ifClick) {
			this.ifClick = ifClick;
		}

		public int getPosition() {
			return position;
		}

		public void setPosition(int position) {
			this.position = position;
		}
	}
	
	public static void main(String args[]){
		new CatchMeGame();
	}

}
