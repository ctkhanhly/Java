
public class Question17{
	public static double goldenRatio(int n){
		double x=1;
		for (int k=0; k<=n-1; k++){
			if(k==0)
				x=1;
			else
			x= 1 + 1/x;	
		}
		return x;
	}
	public static void main(String[] args){
		System.out.println(goldenRatio(4) + " and golden ratio is (1+5^1/2)/2= 1.61703398875");
	}
}