
public class Question15 {
public static boolean onlyDigits(String s){
	for (int i =0; i< s.length(); i++){
		if (!Character.isDigit(s.charAt(i)))
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(onlyDigits("123hahaha"));
System.out.print(onlyDigits("123"));
	}

}
