

public class Question15 {
	
	public static double sqrtEst(double a)
	{
	  double x = a/2;
	  double diff;
	do {
	   x= (x+ a/x)/2;
	   diff = Math.abs(x*x-a);
	  } while (diff>=0.01);
	return x; }

	public static void main(String[] args) {
		System.out.println(sqrtEst(5));
	}

}
