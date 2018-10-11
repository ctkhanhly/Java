
public class Question9 {
//010203010
	public static void printX(int n){
		if(n<=0)
			System.out.print(0);
		else
		{
			printX(n-1);
			System.out.print(n);
			printX(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printX(5);
	}

}
