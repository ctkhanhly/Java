
public class Question15 {
	public static int binomialCoeff(int n, int k){
		if(k== 0 || k ==n)
			return 1;
		else{
			return binomialCoeff(n-1,k-1) + binomialCoeff(n-1,k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binomialCoeff(6,3);
	}

}
