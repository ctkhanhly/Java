
public class Question18 {
	//b
	public static boolean isPalindrome(String word){
		StringBuffer Palindrome = new StringBuffer(word);
		for(int n=word.length()-1; n>=0; n--){
			if (!Character.isLetterOrDigit(word.charAt(n)))
				word= word.substring(0,n)+word.substring(n+1, word.length());
			//Palindrome.deleteCharAt(n);
			else
			     //Palindrome.append( Character.toUpperCase(word.charAt(n)));
			Palindrome.append( word.charAt(n));
		}
		//word.toUpperCase();
		Palindrome.delete(0, Palindrome.length()-word.length());
		if (word.equalsIgnoreCase(Palindrome.toString()))
			return true;
		else
			return false;
	}
	//a
	//public boolean isPalindrome(String word){
//	String Palindrome = "";
//	for(int n=0; n<word.length(); n--){
//		Palindrome += word.charAt(n).toUpperCase(word.charAt(n));
//	}
//	word.toUpperCase();
//	if (Palindrome.toString() == word)
//		return true;
//	else
//		return false;
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("Madam, I'm Adam"));
	}

}
