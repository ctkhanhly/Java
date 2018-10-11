import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Auto_clicker extends JFrame{
//pos: 77, 69
	private static Robot robot = null;
	private static int x;
	private static int y;
	
	public Auto_clicker(){
		this.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent e) {
				Point p = MouseInfo.getPointerInfo().getLocation();
			      x = p.x;
			      y = p.y;
			      
			      System.out.println(x + " " + y);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args){
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		new Auto_clicker();
		
	}
	public static void click(int x, int y){
		for(int i = 0; i<5; i++){
		robot.mouseMove(x, y);
		robot.delay(5);
		//delay to prevent some bugs
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
