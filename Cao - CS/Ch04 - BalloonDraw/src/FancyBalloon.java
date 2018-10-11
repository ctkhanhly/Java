import java.awt.Color;
import java.awt.Graphics;
public class FancyBalloon extends Balloon
{
	public FancyBalloon()
	{
		
	}
	
	public FancyBalloon(int x, int y, int r, Color c)
	{	
		super (x,y,r,c); 
	}
	
	public void draw(Graphics g, boolean makeItFilled)
	{
		
		g.setColor(super.getColor());//subclasses dont have direct access to private (fields) or can change field to public, but preferred priavte
		if (makeItFilled)
			g.fillRoundRect(super.getX() - super.getRadius(),
					super.getY() - super.getRadius(), 4*super.getRadius(), 2*super.getRadius(), 30, 50);
		else
			g.drawRoundRect(super.getX() - super.getRadius(),
					super.getY() - super.getRadius(), 4*super.getRadius(), 2*super.getRadius(), 30, 50);
	}
	
	public double distance(int x, int y)
	{
	    double dx = Math.abs(x - super.getX());
	    double dy = y - super.getY();
	    return Math.max(dx,Math.abs(dy));
	}
}
//define new variable in here?, how call draw method.