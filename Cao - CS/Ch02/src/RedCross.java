
// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedCross extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    //(xCenter, yCenter, width, height)
   //right
    g.fillRect(xCenter, yCenter-5, 50, 10 );
//    //left
    g.fillRect(xCenter-50, yCenter-5, 50, 10);
//    g.setColor(Color.blue);
//    g.fillRect(xCenter-50, yCenter, 50, 10);
//    //up
    g.fillRect(xCenter-5, yCenter-50, 10,50);
    //down
    g.fillRect(xCenter-5, yCenter, 10,50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

