public class Question04 {
	//need to test
	public static String division(int m, int n)
	{
		int subtraction=0;
		int remainder = n;
		if (n<m)
		{
			return "Quotient: " + subtraction + "Remainder: " + remainder;
		}
		else 
		{
			for ( subtraction = 0 ;remainder-m >=0; subtraction++);
			{
				remainder -= m;
			}
			remainder = remainder + m;
			return "Quotient: " + subtraction + "Remainder:" +remainder;
		}
	}
	public static void main(String[] args) {
		System.out.println(division(5, 10));
		System.out.println(division(10, 55));
	}

}
