import java.awt.Color;

public class Clothes 
{
	private int size;
	private Color color;
	private boolean clean;
	private String sleeves;
	
	public Clothes()
	{
		size = 2;
		color = Color.green;
		clean = true;
	}
	public Clothes (int s, Color c)
	{
		size = s;
		color = c;
		clean = true;
	}
	public int getSize()
	{
		return size;
	}
	public Color getColor()
	{ 
		return color;
	}
	public boolean isClean()
	{
		return clean;
	}
	public void wash()
	{ 
		clean = true;
	}
	public void wear()
	{ 
		clean = true;
				
	}
	public String toString()
	{
		return "Size: " + size + " Color: " + color + "Clean: " + clean;
	}
}
