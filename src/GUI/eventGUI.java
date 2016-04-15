package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class eventGUI extends JFrame{
	
	private JButton addButton, minusButton;
	private JPanel myPanel;
	private JLabel sumLabel;
	private int result;
	
	public eventGUI(){
		
		//1.Set the top-level container frame visible
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//2.Design the frame
		this.setSize(400,300);
		this.setTitle("Add & Minus");
		
		//3.Create the panel and design it,then add it into the top-level container
		myPanel = new JPanel();
		//myPanel.setBackground(Color.RED);
		myPanel.setLayout(new BorderLayout());//Note that layout is a object which needs to be create
		//this.getContentPane().add(myPanel);//Panel occupied the whole content pane by default
		
		//4.Create the panes on the panel, then add it into the panel
		addButton = new JButton("+");
		//myPanel.add(addButton,BorderLayout.EAST);
		this.getContentPane().add(addButton,BorderLayout.EAST);
		addButton.addActionListener(new addListener());
		//Method 1 to add event
		/*addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				result=result+1;
				sumLabel.setText(""+result);
			}		
		});*/
				
		minusButton = new JButton("-");
		//myPanel.add(minusButton,BorderLayout.WEST);
		this.getContentPane().add(minusButton,BorderLayout.WEST);
		minusButton.addActionListener(new minusListener());
		//Method 1 to add event
		/*minusButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				result=result-1;
				sumLabel.setText(""+result);
			}		
		});*/
		
		sumLabel = new JLabel(""+result, JLabel.CENTER);
		//myPanel.add(sumLabel,BorderLayout.CENTER);
		this.getContentPane().add(sumLabel,BorderLayout.CENTER);
		
		
		
	}
	
	//Method 2 to add event
	public class addListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result=result+1;
			sumLabel.setText(""+result);
		}		
	}
	
	//Method 2 to add event
	public class minusListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result=result-1;
			sumLabel.setText(""+result);
		}		
	}
	
	public static void main(String args[]){
		new eventGUI();
	}

}

