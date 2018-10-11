
public class Question11 {
public static String cutOut(String s, String cut){
	return s.substring(0, s.indexOf(cut)) + s.substring(s.indexOf(cut)+cut.length(), s.length());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(cutOut("My name is LyHeHe", "HeHe"));
	}

}
