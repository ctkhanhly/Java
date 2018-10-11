
public class Question2 {
//15
	public static int mysterySum(int n){
		if(n==0)
			return 0;
		else
			return 3 + mysterySum(n-1);
	}
	public static void main(String[] args){
		System.out.println(mysterySum(5));
		//value: 15
	}
}
