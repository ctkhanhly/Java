
	// Chapter 13 Question 19

	/**
	 * This program draws a picture of nested triangles
	 */

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Container;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class Fractal extends JPanel
	{
	  public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);
	    drawTriangles(g, 100, 80, 64);
	  }

	  /**
	   * Draws a picture made of triangles in Graphics g
	   * with the base midpoint at (x, y) and base half-length r
	   */
	  public void drawTriangles(Graphics g, int x, int y, int r)
	  {
		  if(r==4)
		  {
	    g.drawLine(x-4,y, x,y+4);
	    g.drawLine(x, y+4, x+4, y);
	    g.drawLine(x-4, y, x+4, y);
	    g.drawLine(x-4, y, x+4, y);
	    }
		  else{
			  g.drawLine(x-r, y, x, y+r);
			  g.drawLine(x, y+r, x+r, y);
			  g.drawLine
			  drawTriangles(g, x/2,y, r/2);
		  }
	  }

	  public static void main(String[] args)
	  {
	    JFrame w = new JFrame("Triangles");
	    w.setBounds(300, 300, 200, 120);
	    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Fractal panel = new Fractal();
	    panel.setBackground(Color.WHITE);
	    Container c = w.getContentPane();
	    c.add(panel);
	    w.setResizable(false);
	    w.setVisible(true);
	  }
	}


