import java.util.Scanner;
public class Question06{//mexican population
	public static final int year0 = 2014;
	public static final double population0 = 123.8;//in millions
	public static final double growthRate = 0.5/100;
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number that represents Mexican population in millions: ");
		double n = kb.nextDouble();
		//population = 123.8*100.5^year
		int year = year0;
		double population;
		//method - year when populatio exceed n.
		for (int k = 1; population0*Math.pow(1+growthRate, k)<= n; k++)
			year++;
		
		System.out.println(year+1);
	}
}