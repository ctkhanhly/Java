import java.util.Scanner;
public class Question09 {
public static void main(String[] args){
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Enter a positive integer under 10: ");
	int n = kb.nextInt();
	
	int sum = 0;
	for (int k=1; k<=n; k++)
	{
		sum +=k;
		if (k==1)
			System.out.print(k);
		else
			System.out.print(k + " + ");
	}
	System.out.println("= " +sum);
	kb.close();
	
	System.out.println(Math.sqrt(8));
}

}
