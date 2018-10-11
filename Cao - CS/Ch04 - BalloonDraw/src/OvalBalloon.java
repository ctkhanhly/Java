import java.awt.Color;
import java.awt.Graphics;
public class OvalBalloon extends Balloon
{
	public OvalBalloon()
	{  }
	public OvalBalloon(int x, int y, int r, Color c)
	{	super (x,y,r,c);  }
	public void draw(Graphics g, boolean makeItFilled)
	  {
		 g.setColor(super.getColor());//subclasses dont have direct access to private (fields) or can change field to public, but preferred priavte
		    if (makeItFilled)
		      g.fillOval(super.getX() - super.getRadius()/2,
		    		  	 super.getY() - super.getRadius(), super.getRadius(), 2*super.getRadius());
		    else
		    g.drawOval(super.getX() - super.getRadius()/2,
		              super.getY() - super.getRadius(), super.getRadius(), 2*super.getRadius());
	  }
	  public double distance(int x, int y)
	  {
	    double dx = (x - super.getX())*2;
	    double dy = y - super.getY();
	    return Math.sqrt(dx*dx + dy*dy);
	  }
}
