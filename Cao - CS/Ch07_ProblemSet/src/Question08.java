public class Question08{
	public static int addOdds(int n){
		int sum = 0;
		for (int k=1; k<=n; k+=2)
			sum+=k;
		return sum;
	}
}

