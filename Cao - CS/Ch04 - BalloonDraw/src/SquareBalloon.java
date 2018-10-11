	import java.awt.Color;
	import java.awt.Graphics;
	public class SquareBalloon extends Balloon
	{
		public SquareBalloon()
		{  }
		public SquareBalloon(int x, int y, int r, Color c)
		{	super (x,y,r,c);  }
		public void draw(Graphics g, boolean makeItFilled)
		  {
			 g.setColor(super.getColor());//subclasses dont have direct access to private (fields) or can change field to public, but preferred priavte
			    if (makeItFilled)
			      g.fillRect(super.getX() - super.getRadius(),
			                super.getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
			    else
			    g.drawRect(super.getX() - super.getRadius(),
			                 super.getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
		  }
		  public double distance(int x, int y)
		  {
		    double dx = x - super.getX();
		    double dy = y - super.getY();
		    return Math.max(dx, dy);
		  }
   } 
