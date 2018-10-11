import java.util.Scanner;
public class TestProlem17 {
	public static double getOrderTotal(int bp, int nb)
	{
		if (bp==1 && nb ==1)
			return 39.95;
		else if ((bp + nb)>=12)
			return 16*(bp + nb);
		else if ((bp + nb)>=3)
			return 16.95*(bp + nb);
		else return 20.95*bp + 21.95*nb;
	}
public static void main(String[] args){
	Scanner hehe = new Scanner(System.in);
	
	System.out.println("How many copies of \"Be Prepared\" books did you buy:  ");
	int bp = hehe.nextInt();
	
	System.out.println("How many copies of \"Next Best\" books did you buy:  ");
	int nb = hehe.nextInt();
	
	double totalcost = getOrderTotal(bp, nb);//dont have to put in a variable
	if (bp>=0 && nb >=0)
	System.out.println("Total cost: " +totalcost);
	else 
		System.out.println("Are you kidding me?");
	hehe.close();
}
}
