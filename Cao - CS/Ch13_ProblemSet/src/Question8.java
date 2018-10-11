
public class Question8 {
	public static int sumDigits(int n){
		//precondition: n>=0
		String digit = Integer.toString(n);
		//int nextNumber = Integer.parseInt(digit.substring(1));
		
		if(digit.length()==1)
			return Integer.parseInt(digit);
		else
		{
			int nextNumber = Integer.parseInt(digit.substring(1));
			String firstDigit = Character.toString(digit.charAt(0));
			return Integer.parseInt(firstDigit) + sumDigits(nextNumber);		 
		}

	}
	public static boolean divisibleBy3(int n){
		if(n<10 && n>0)
			return n==3 || n==6 || n==9;
		else{
			n = sumDigits(n);
			//return n==3|| n==6 || n==9;
			return divisibleBy3(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String digit = "1";
//System.out.println(Integer.parseInt(Character.toString(digit.charAt(0))));
System.out.println(sumDigits(15555678));
System.out.println(divisibleBy3(129));
	}

}
