import java.math.BigInteger;
import java.util.ArrayList;

public class Question11 {
	public static ArrayList<BigInteger> FibonaccNumbers(int n){
		ArrayList<BigInteger> element = new ArrayList<BigInteger>();
		element.add(new BigInteger("0"));
		element.add(BigInteger.valueOf(1));
		for(int i = 2; i < n; i++){
			element.add(element.get(i-1).add(element.get(i-2)));
		}
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a1 = BigInteger.valueOf(1);
		BigInteger a2 = new BigInteger("2");
		a1.add(a2);//return new BigInteger
		System.out.println(a1.add(a2));//3
		System.out.println(FibonaccNumbers(100).get(99).toString());
		System.out.println(FibonaccNumbers(100).get(99).toString().length());
	}

}
