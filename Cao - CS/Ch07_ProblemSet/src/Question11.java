
public class Question11 {

	public static boolean isPerfectSquare(int p)
	{
		int sum = 0;
		for (int k=1; k<=(2*p-1); k+=2){
			sum+=k;
		}
		if (sum ==p)
			return true;
		else
			return false;
		//return sum==n;
	}
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(55));
	}

}
