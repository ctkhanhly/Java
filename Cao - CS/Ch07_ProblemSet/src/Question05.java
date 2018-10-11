import java.util.Scanner;
public class Question05{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int n = kb.nextInt();
		kb.nextLine(); //consume the rest of the line
		
		System.out.print("Enter a line of text: ");
		String text = kb.nextLine();
		kb.close();
		
		for (int k = 1; k<=n; k++)
			System.out.println(text);
	}
}