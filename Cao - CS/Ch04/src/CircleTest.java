
public class CircleTest 
{
public static void main(String[] args)
	{
		Circle funCircle = new Circle();
		funCircle.getRadius();
		funCircle.getArea();
		
		Cylinder c = new Cylinder(5,10);
		
		System.out.println(c.getArea());
	}
}
