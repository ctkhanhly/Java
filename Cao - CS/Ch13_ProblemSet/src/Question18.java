
public class Question18 {

	public static double sequence(int n){
		if(n==1)
			return 1;
		else{
			return 1 + 1/sequence(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(sequence(5));
	}

}

