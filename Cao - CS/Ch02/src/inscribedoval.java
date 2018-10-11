import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class inscribedoval extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    
    g.setColor(Color.RED);
    g.fillOval(xCenter-20, yCenter-20,40,40);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter-15, yCenter-15,30,30);
    g.setColor(Color.RED);
    g.fillOval(xCenter-5, yCenter-5, 10,10);
    //just to draw ^^
    g.drawOval(xCenter-25, yCenter-25, 50, 50);
   
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("inscribed oval");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    inscribedoval panel = new inscribedoval();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }

}
