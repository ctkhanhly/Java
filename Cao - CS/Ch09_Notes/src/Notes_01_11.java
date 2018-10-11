

public class Notes_01_11 {
//Method to return roots of a
	//quadratic
	//x= -b+/- root(b^2-4ac)/2a
	//double [] 
	//b^2 -4ac : discriminant
	//d<0 null
	//d= 0 x[0] = x[1] return x
	// d>0 return x
	//a is not 0
	public static void main(String[] args){
		int b = 0;
		try{
			int a = 1/b;
		}
		//1/0: arithmetic exception 
		catch(ArithmeticException e){// object, name it
			//rather than shutting program down, I can do catch/ print this and move on
			System.out.println("Sorry, you cannot divide by 0");
		}
		//... Program continues, program does not get an error.
		//if there is no catch, program would stop
		finally{//regardless of try/ catch , not error, skip catch, do this anyway
			System.out.println("b was" + b);
		}
		
		
		double[] myArray = new double[2];
		myArray = quadForm(1,0,-4);
		try{
			System.out.println(quadForm(1,2,3)[0] + " " + quadForm(1,2,3)[1]);
		}
		catch(NullPointerException e){
			System.out.println("no real roots");
		}
		System.out.println(quadForm(1,2,1)[0] + " " + quadForm(1,2,1)[1]);
		System.out.println(quadForm(1,4,3)[0] + " " + quadForm(1,4,3)[1]);
		//Array is object -> print toString method
	}
	public static double[] quadForm(double a, double b, double c)
	{
		double [] x = new double[2];//length = 2
		double d  = b*b - 4*a*c;
		if (a == 0)
			throw new IllegalArgumentException("a = 0");// creating that catch throw
		//can put anything here is ok: ArithmeticException
		else 
		{
			if (d<0)
				return null;
			else if (d==0)
			{
				x[0]= x[1]= (-b/(2*a));
				//return x;
			}
			else 
			{
				x[0] = (-b - Math.sqrt(d))/(2*a);
				x[1] = (-b + Math.sqrt(d))/(2*a);
				//return x;
			}				
		}
		return x;
	}
}
