
public class Question5 {
	public static boolean isGood(String s){
		int n = s.length();
		return n <2 || (s.charAt(0) == s.charAt(n-1) && isGood(s.substring(1, n-1)));
	}
	//SYMMETRIC? // words that can reverse 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//c,e,g,h
		System.out.println(isGood("XOXOX"));
	}

}
