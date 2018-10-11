import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

//you can assign serial number to multiple classes for compatibility sake
//in the future
@SuppressWarnings("serial")

public class GraphicsDemo extends JFrame{

	public static void main(String[] args) {
		
		new GraphicsDemo();
	}

	public GraphicsDemo(){
		this.setSize(500,500);
		this.setTitle("Drawing Shapes");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.red);
		
	      
		//test for plugboard
		JPanel p1 = new JPanel();
		p1.setBounds(400,400,10,20);
		p1.setBackground(Color.pink);
		p1.setForeground(Color.pink);
		
		JPanel p2 = new JPanel();
		p2.setBounds(440,410,10,20);
		p2.setBackground(Color.pink);
		p2.setForeground(Color.pink);
		
		
		this.add(p1);
		this.add(p2);
		//this.add(new DrawStuff(), BorderLayout.CENTER);
		this.add(new DrawStuff());
		this.setVisible(true);
		
		
	}
	//new component -> based off JComponent
	private class DrawStuff extends JComponent{
		
		public void paint(Graphics g){//graphics: draw components inside JFrame
            // Extends graphics so you can draw dimensional shapes and images
            Graphics2D graph2 = (Graphics2D)g;
		    // Sets preferences for rendering
		    // KEY_ANTIALIASING reduces artifacts on shapes
		    // VALUE_ANTIALIAS_ON will clean up the edges

            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //many shapes
            //upper left hand corner for x and y
            //ending points for the line( x, y ) 2D dimension
            Shape drawLine = new Line2D.Float(20,90,55,250);
            
            //x,y, width, height, start angle, 
            //extent- degree of the arc, type of arc( open = not connect start and end position)
            //straight line connecting start and end point : chord
            //pie: make pie shape
            //an imaginary rect surrounds the arc
            Shape drawArc2D = new Arc2D.Double(5, 150, 100, 100, 45, 180, Arc2D.OPEN);
            //Shape drawArc2D = new Arc2D.Double(400, 410, 30, 10, -Math.toDegrees(Math.atan(10/20)), 180, Arc2D.OPEN);
			
            Shape drawArc2D2 = new Arc2D.Double(5, 200, 100, 100, 45, 45, Arc2D.CHORD);

            Shape drawArc2D3 = new Arc2D.Double(5, 250, 100, 100, 45, 45, Arc2D.PIE);

            graph2.setPaint(Color.BLACK);
            //graph2.draw(drawLine);
            graph2.draw(drawArc2D);
            graph2.draw(drawArc2D2);
            graph2.draw(drawArc2D3);
           
            //upper left corner x,y, bottom right hand corner x,y
            Shape drawEllipse = new Ellipse2D.Float(10, 10, 100, 100);

            // Rounded the rectangle be defining arc height then arc width
            //upper left corner x,y, bottom right hand corner x,y, arc height, width
            Shape drawRoundRec = new RoundRectangle2D.Double(25, 25, 50, 50, 45, 45);

            // Draw a curve with 4 points
            CubicCurve2D cubicCurve = new CubicCurve2D.Double();
            // You can also set the curve outside of the definition
            // x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2
            //cubicCurve.setCurve(110, 50, 300,
            //        200, 200, 200, 90, 263);
            cubicCurve.setCurve(405, 410, 410,
                    400, 400, 430, 445, 420);
            // Draw rectangle by defining upper left x, y and width then height
            Shape drawRect = new Rectangle2D.Float(300, 300, 150, 100);
            // // Draw a curve with 3 points
            // x1, y1, ctrlx1, ctrly1, x2, y2
            Shape drawQuadCurve = new QuadCurve2D.Float(300, 100, 400, 200, 150, 300);
            //Shape drawQuadCurve = new QuadCurve2D.Float(405, 410, 410, 430, 445, 420);
//transparent rect
            Shape drawTransRect = new Rectangle2D.Double(300, 300, 75, 50);
            graph2.draw(drawEllipse);
            // Set the fill color
            graph2.setColor(Color.GREEN);
            // Draw a shape with a fill
            graph2.fill(drawRoundRec);
            graph2.fill(drawRect);
            graph2.setPaint(Color.BLACK);
            graph2.setStroke(new BasicStroke(3));
            graph2.draw(cubicCurve);
            graph2.draw(drawRect);
            graph2.draw(drawQuadCurve);

            // This makes everything drawn after to be 60% transparent
            graph2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.40F));
            // This eliminates transparency
            //graph2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0F));
            
            // starting x point, starting y point, start color, end x, end y, end color
            // You can use hex color codes 0x66ffff equals color.CYAN
            // VERTICAL GRADIENT
            GradientPaint theGradient = new GradientPaint(0,0, Color.BLUE, 0,60, new Color(0x66ffff));
            // HORIZONTAL GRADIENT
            // GradientPaint theGradient = new GradientPaint(0,0, Color.BLUE, 75,0, new Color(0x66ffff));

            // To make the last color defined start in the center
            // GradientPaint theGradient = new GradientPaint(0,0, Color.BLUE, 0,60, new Color(0x66ffff), true);
            graph2.setPaint(theGradient);
            graph2.fill(new Rectangle2D.Float(10, 10, 150, 100));
            graph2.fill(drawTransRect);



		}
	}
}
