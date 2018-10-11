
public class Question8 {
	public static double[] quadForm(double a, double b, double c)
	{
		double [] x = new double[2];
		double [] y = new double[1];
		double d  = b*b - 4*a*c;
		if (a == 0){
			//throw new IllegalArgumentException("a = 0");// creating that catch throw
			if(b!=0){
				y[0] = -c/b;
			}
			else if (b==0 && c!=0)
				return null;
			else
				throw new IllegalArgumentException();
			return y;
				
		}
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
			return x;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(quadForm(0,0,1)[0] );
	}

}
