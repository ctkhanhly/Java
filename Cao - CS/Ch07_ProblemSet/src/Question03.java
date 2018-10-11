
public class Question03 {
	
	public static int product(int a, int b)
	{
		int sum = 0;
		if (a==0 || b==0)
			return 0;
		for(int k= 1; k<=b; k++)
			sum += a;
		
		return sum;
	}
	

	public static void main(String[] args) {
		System.out.println(product(5, 10));
		System.out.println(product(5, 0));
	}

}
