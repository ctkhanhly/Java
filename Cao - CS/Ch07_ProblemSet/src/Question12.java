
public class Question12 {

	public static int sumDigits(int n)
	{
		int sum=0;
		int k = n;
		for (k=n; k>=10; k/=10 ){//k/10=(k-k%10)/10, n>0.
			sum+=(k%10);
		}
		sum+=k;
//		while (n>0){
//			sum+=n%10;
//			n/=10;
//		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(57565536));
	}

}
