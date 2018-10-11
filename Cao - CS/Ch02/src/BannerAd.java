/**
 * This program displays a message that moves horizontally
 * across the window.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BannerAd extends JPanel
                 implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the message
  private int msgID = 1;

  // Called automatically after a repaint request
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g); // Paint the background
   g.setColor(Color.RED);
   
   int xPos = getWidth() / 2 -30;
   int yPos = getHeight() / 2;
   
   if (msgID ==1)
   { 
 	  g.drawString("East or West", xPos, yPos);
   }
   else // if msgID == -1
   {
	   g.drawString("Java is Best", xPos, yPos);
   }
   
  }
   
 
  public void actionPerformed(ActionEvent e)
  {
    
	  msgID = -msgID;
	  repaint();
	  
  }
 
 
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Action Demo");

    // Set this window's location and size:
    // upper-left corner at 300, 300; width 300, height 100
    window.setBounds(300, 300, 300, 100);

    //  Create panel, a Banner object, which is a kind of JPanel:
    BannerAd panel = new BannerAd();
    panel.setBackground(Color.CYAN);  // the default color is light gray

    // Add panel to window:
    Container c = window.getContentPane();
    c.add(panel);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    // Set the initial position of the message:
    panel.xPos = panel.getWidth();
    panel.yPos = panel.getHeight() / 2;

    // Create a Timer object that fires every 30 milliseconds;
    // attach it to panel so that panel "listens to" and
    // processes the timer events; start the timer:
    Timer clock = new Timer(2000, panel);
    clock.start();
  }
}
