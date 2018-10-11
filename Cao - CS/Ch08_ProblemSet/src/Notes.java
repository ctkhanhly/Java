
public class Notes {
public static void main(String[] args){
	String myString = "Hello, World!";
	int x = myString.length();
	System.out.println(myString.charAt(x-1));
	//System.out.println(myString.substring(7));
	myString = myString.substring(7);//myString is changed forrever.
	//old string is still there, just not pointing to it.
	//->take up memory, program runs slower.
	//garbage collector removes it if nothing pointing to it.
	//int x=3; 
	//x++// change itself.
	System.out.println(myString);
}
}
