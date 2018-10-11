
public class Question7 {
public static String convertName(String s){
return s.substring(s.indexOf(',')+1) + " "+ s.substring(0,s.indexOf(',') );
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(convertName("Cao,Ly"));



//String m = "Ly Cao";
//System.out.print(m.trim());// print: Ly Cao
	}

}
