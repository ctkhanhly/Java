
public class Hw25p130 
{
	public static double areaOfATriangle(double a, double b, double c)// () w/o anything in parenthesis
	{
		//double a = 3, b = 4, c = 5;
		//double halfperimeter = p;
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));//heron formula
		
	}

public void main(String[] args)
{
	double area = areaOfATriangle(2,3,4);
	System.out.println(area);
	//System.out.println(Math.sqrt(double a=5));//wrong
}
}