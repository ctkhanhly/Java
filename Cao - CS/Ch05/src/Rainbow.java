// Chapter 5 Question 27

// ________________________________________________
//Ly
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private Color skyColor;//=Color.CYAN

  public Rainbow()
  {
	skyColor = Color.CYAN;
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
   int xCenter = width / 2;
   int yCenter = height * 3/4;
    // Declare and initialize the radius of the large semicircle:
   int largeRadius = width *1/4;//width times 1 and then divides by 4; 1/4*width: 1/4 is trunculated to 0, 0 *width = 0
   System.out.println(largeRadius);

    g.setColor(Color.RED);

    // Draw the large semicircle: //abstract void	fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
     g.fillArc(xCenter - largeRadius, yCenter - largeRadius , 2*largeRadius, largeRadius*2, 0, 180 );

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
     int smallRadius = height/4;
     g.setColor(Color.MAGENTA);
     g.fillArc(xCenter - smallRadius, yCenter - smallRadius, 2*smallRadius, smallRadius*2, 0, 180);
     System.out.println(smallRadius);
     
    int mediumRadius = (int)(Math.sqrt(largeRadius*smallRadius)+0.5);
    g.setColor(Color.GREEN);
    g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, 2*mediumRadius, mediumRadius*2, 0, 180);
    System.out.println(mediumRadius);
    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    int innermostRadius = largeRadius - 3*mediumRadius + 3*smallRadius;
    //(r(l)- r(m)) + r(s) - r(i))/2 = r(m)- r(s)-> r(i) = r(l) - 3r(m) +3r(s)
    g.setColor(skyColor);
    // Draw the sky-color semicircle:
    g.fillArc(xCenter - innermostRadius, yCenter - innermostRadius, 2*innermostRadius, innermostRadius*2, 0, 180);
    System.out.println(innermostRadius);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
