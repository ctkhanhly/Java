import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventsDemo extends JFrame{
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;
	JPanel thePanel;
	
	public static void main(String[] args) {
		new EventsDemo();

	}
//	An operating system is system software that manages
//	computer hardware and software resources and provides 
//	common services for computer programs. Wikipedia

	public EventsDemo(){
		//point on screen
		Point p = MouseInfo.getPointerInfo().getLocation();
	      int x = p.x;//Math.abs(p.x- this.getX());
	      int y = p.y;//Math.abs(p.y- this.getY());
	      System.out.println(p);
	      
		this.setSize(400, 400);
		//toolkit is super class for abstract window tk(awt)
		//-> allows us to ask questions of the os: operating system
	
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		//hold width and height for the component( the actual screen)
		//that we are displaying our frame on
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight()/ 2);
		
		this.setTitle("My frame");
		this.setLocation(xPos, yPos);// => in the center of the screen
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My first Frame");
		
		thePanel = new JPanel();
		
		//Listen for events to occur on my button
		button1 = new JButton("Click here");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		button1.setForeground(Color.PINK);//letters
		button1.setBackground(Color.BLUE);
		thePanel.add(button1);
		
		textField1 = new JTextField("", 15);
		
		ListenForKeys lForKeys = new ListenForKeys();
		textField1.addKeyListener(lForKeys);
		thePanel.add(textField1);
		
		textArea1 = new JTextArea(15,20);
		textArea1.setText("Tracking Events\n");
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(scrollbar1);
		this.add(thePanel);
		
		JLabel label = new JLabel();
		label.setText("Hello Ly He He");
		label.setForeground(Color.blue);
		label.setBackground(Color.green);
		thePanel.add(label);
		
		JLabel label2 = new JLabel();
		label2.setText("Hello Ly He He");
		thePanel.add(label2);
		thePanel.setBackground(Color.cyan);
		
		//frame = window
		ListenForWindow lForWindow = new ListenForWindow();
		this.addWindowListener(lForWindow);
		this.setVisible(true);
		
		
		ListenForMouse lForMouse = new ListenForMouse();
		thePanel.addMouseListener(lForMouse);
	}
	//implement Listeners - track how many times the button has been clciked
	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == button1){
				buttonClicked++;
				
				textArea1.append("Button clicked " + buttonClicked + "times\n");
				
				//e.getSource().toString();
			}
		}
	}
	private class ListenForKeys implements KeyListener{
		
	

	public void keyTyped(KeyEvent e) {
		textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		textArea1.append("Key Released: " + e.getKeyChar() + "\n");

		
	}
	}
	private class ListenForWindow implements WindowListener{

		//when window is first created
		public void windowOpened(WindowEvent e) {
			textArea1.append("Window Created");
			
		}

		//when it is closed from the menu
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		//whenever window is closed
		//this.disposed(); if
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		//been minimized
		public void windowIconified(WindowEvent e) {
			textArea1.append("Window is minimized");
			
		}

		//window is gone from minimized to normal state
		public void windowDeiconified(WindowEvent e) {
			textArea1.append("Window in Normal State");
			
		}

		//when window is active
		public void windowActivated(WindowEvent e) {
			textArea1.append("Window is active");
			
		}

		//when you choose other window
		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Window is not active");
			
		}
		
	
	}
	private class ListenForMouse implements MouseListener{

		
		public void mouseClicked(MouseEvent e) {
			//on the panel
			textArea1.append("Mouse Panel pos: " + e.getX() + " " + e.getY() + "\n");
			//on the screen
			textArea1.append("Mouse Screen pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
			//mouse button 1 -> left click
			textArea1.append("Mouse Button: " + e.getButton() + "\n");
			textArea1.append("Number of mouse clicks: " + e.getClickCount() + "\n");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			thePanel.setBackground(Color.pink);
			
		}

		//enter panel area
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		//left panel area
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}