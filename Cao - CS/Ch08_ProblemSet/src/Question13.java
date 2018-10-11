
public class Question13 {
public boolean startsWith(String prefix){
	//return substring(0, prefix.length()-1).equals(prefix);
	String h = "";
	return h.indexOf(prefix)==0;
}
public static boolean endsWith(String suffix){
	//return substring(lastIndexOf(suffix), length()-1).equals(suffix);
	String h = "123return";
	return (h.lastIndexOf(suffix)+ suffix.length())==h.length() && h.length()>=suffix.length();
	//return (h.lastIndexOf(suffix)+ suffix.length())==h.length() && h.lastIndexOf(suffix)!=-1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String h ="123return";
System.out.println(h.lastIndexOf("1234return"));
System.out.println(endsWith("1234return"));
	}

}
