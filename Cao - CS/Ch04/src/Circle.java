
public class Circle 
{
//Fields
	private int radius;
	//Constructor
	public Circle()
	{
		radius = 2;
	}
	public Circle(int r)
	{
		radius = r;
	}
	//Method
	public double getArea()// need a variable, put it in parameter
	{
		return (Math.PI * Math.pow(radius, 2));
	}
	public int getRadius(){
		return radius;
	}
}
