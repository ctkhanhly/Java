import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
System.out.println("Enter the first number: ");
String s1 = input.nextLine();
System.out.println("Enter the second number: ");
String s2 = input.nextLine();
//String s1 = "" + (int)Integer.parseInt(n1);
//String s2 = "" + (int)Integer.parseInt(n2);
int n1 = Integer.parseInt(s1);
int n2 = Integer.parseInt(s2);
System.out.println(s1.compareTo(s2));
System.out.println(n1-n2);

//test 10 and 250 wrong.
//why?
	}

}
