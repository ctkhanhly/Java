
public class Question01 {
	//flowchart and pseudocode
	//is this question 1?
	public static double sumUpToPIBy6(int n)
	{
		double sum = 0;
		for(int k=1; k<=n; k++)
		{
			sum += 1/(k*k);
		}
		return sum;
	}

	public static void main(String[] args) {
 
 if (Math.abs(sumUpToPIBy6(10000) - Math.PI/6)<=0.001)
		System.out.println( "SumUpToPiBy6 of 10000 terms is very close to PI/6");
	else 
		System.out.println( "SumUpToPiBy6 of 10000 terms is not that close to PI/6");
	}

}
