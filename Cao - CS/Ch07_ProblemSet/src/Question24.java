import java.util.Scanner;
public class Question24{
	public static final double aRipple= 0.26;
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		char answer= 'm';
		
		for(int k=1; k<=2; k++){
		System.out.print("Enter quantity: ");
		int q = kb.nextInt();
		kb.nextLine();//skip the next line
		if(q%25==0){
		System.out.print("You have ordered q ripples -- $"+ aRipple*q );
		System.out.println();
		System.out.println();
		
			System.out.println("Next customer(y/n): ");
			kb.nextLine();
		}
		else{
		System.out.println("Ripples can be ordered only in packs of 25.");
		System.out.println();
		while(!(answer=='y'|| answer=='n')){
			System.out.println("Next customer(y/n): ");
			//kb.nextLine();
			String str = kb.nextLine().trim();
			if (str.length()==1)
				answer = str.charAt(0);
			else
				answer = ' ';
			}
		}
		}
		kb.close();
		System.out.println("Thank you for using Ripple System.");
		
//kb.nextLine	
	}
}
	