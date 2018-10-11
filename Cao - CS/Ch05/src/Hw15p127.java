import java.util.Scanner;
public class Hw15p127 
{
	public static void main(String[] args)
	{
		
		
		Scanner hehe = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int n = hehe.nextInt();
		
		hehe.close();
		
		//swap number:
		int n2 = n - n%100 + n%10*10 + (n%100)/10;//-n%100 + n510*10 + x/10%10
		System.out.println(n2);
		
		
//the other way:	
//		int swap;
//		swap = n;
//		n = n2;
//		n2 = swap;
//		System.out.println(n);
	}
}
