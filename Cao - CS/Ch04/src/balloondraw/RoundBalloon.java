/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{
  
  public RoundBalloon()
  {
    super(); //this is optional: default
  }
  public RoundBalloon(int x, int y, int r, Color c)
  {
	  super(x,y,r,c);
  }
  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
	  g.setColor(super.getColor());//subclasses dont have direct access to private (fields) or can change field to public, but preferred priavte
	    if (makeItFilled)
	      g.fillOval(super.getX() - super.getRadius(),
	                super.getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
	    else
	    g.drawOval(super.getX() - super.getRadius(),
	                 super.getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
  }
}