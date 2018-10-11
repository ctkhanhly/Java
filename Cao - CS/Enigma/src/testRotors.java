import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Arc2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testRotors extends JFrame{
	 
	
	 public static void main(String[] args){
		 String roll1_1s =  "abcdefghijklmnopqrstuvwxyz";
		 ArrayList<String> roll1 = new ArrayList<String>();
		 for(int i = 0; i<26; i++){
			 //roll1.add(roll1_1s.charAt(i));
			 roll1.add(Character.toString(roll1_1s.charAt(i)));
			 System.out.print(roll1.get(i) + " ");
		 }
		 System.out.println(roll1.indexOf("f"));
		 ArrayList<String> roll2 = new ArrayList<String>();
		 roll2= roll1;
		 System.out.println("roll2: " +roll2);
		 String h = "A";
		 char m = h.charAt(0);
		 System.out.println(Character.toUpperCase('m')== 'M');
		 System.out.println(Math.toDegrees(Math.atan(1)));
		 //Math.toRadians(degrees).
		 
		 new testRotors();
         
	 }
	 public testRotors(){
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	     setTitle("Enigma Machine Simulation");
	     setResizable(false);
	     //get screen size
	     Toolkit tk = Toolkit.getDefaultToolkit();
		 Dimension dim = tk.getScreenSize();
		 int xPos = (dim.width / 2) - (this.getWidth() / 2);
		 int yPos = (dim.height / 2) - (this.getHeight()/ 2);
		 setLocation(xPos-280, yPos-320);
	     setDefaultLookAndFeelDecorated(true);
	     setSize(560, 680);
	     
	     Container pane = getContentPane();
	      pane.setLayout(null);
	      pane.setBackground(new Color(200,80, 50));
	     
	     
	     JPanel panelQ = new JPanel();
	     panelQ.setBounds(20,420,10,20);
	     panelQ.setBackground(Color.pink);
	     
	     JLabel labelQ = new JLabel("Q");
	     labelQ.setBounds(20, 400, 10, 20);
	     System.out.println(labelQ.getText());
	     //labelQ.setLocation(20,400);
	     //labelQ.setForeground(Color.black);
	     pane.add(labelQ);
	     pane.add(panelQ);
	     
	     
	     
	     this.setVisible(true);
	 }
		private class DrawStuff extends JComponent{
			public void paint(Graphics g){
	            Graphics2D graph2 = (Graphics2D)g;
	            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            Shape drawArc2D = new Arc2D.Double(5, 150, 100, 100, 45, 180, Arc2D.OPEN);

			}
		}
}
