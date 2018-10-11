
public class Question02 {
	
	public static double sumUpToln2 (int n)
	{
		double sum = 0;
		for(int k=1; k<=n; k++)
		{
			if (k%2 != 0)
				sum += 1/k;
			else
				sum -= 1/k;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		if (Math.abs(sumUpToln2(10000) - Math.PI/6)<=0.001)
			System.out.println( "SumUpToln2 of 10000 terms is very close to natural logarithm of2");
		else 
			System.out.println( "SumUpToln2 of 10000 terms is not that close to natural logarithm of2");
		
	}

}
