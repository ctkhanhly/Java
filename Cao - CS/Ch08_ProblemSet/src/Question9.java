
public class Question9 {
public static boolean repetitiveString(String n){
	String m = n.substring(1)+ n.charAt(0);
	return m.equals(n);//m==n is wrong b/c they are diffent pointers, never the same
	//why integers could be ==.
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(repetitiveString("hahaha"));
System.out.println(repetitiveString("hhh"));

	}

}
