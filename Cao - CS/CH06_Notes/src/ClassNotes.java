
public class ClassNotes {
	public static int min(int a, int b){
		if(a<b)
			return a;
		else 
			return b;
		}
	public static void main(String[] args){
		System.out.println(min(50,40));
		/* 
		if (condition){
			//DO THIS!
			//THEN DO THIS
			//THEN DO THIS...
			...
		else{
			//DO THIS!
			...
		 */
//Relational operations: >: greater than, <: less than; 
		//gives back true/false 
		//>=: greater than or equal to; <=: less than or equal to
		//== equal to( testing relationship of equality)
		//!: not; !=: not equal to
		
		// x= 9: assignment operator
		//if (x==10) { do this} -> relational operator
		
	//logical operations
		//&& -> and
		//|| -> or
//		int a = 5;
//		if (a<1 && a>-2){
//		}
		int x = 5;
		int y = 6;
		System.out.println(x>y);
		
		int age = 21;
		if (age<18){
			System.out.println("You're a miner");//true does not need to be in quote
		}
		else if(age<21){
			System.out.println("You're in your prime, kid!");
		}
		else 
			System.out.println("You're getting old");
		//as soon as it finds the true, it runs whatever it stops there.
		//can have as many else as I want
		//if only 1 line - dont need curly brackets
		//int age = 23;
//		  if (age>21)
//				System.out.println(true);//true does not need to be in quote
//			else
//				System.out.println(false);
		//7
		int angle = 117;
		if (angle==90)
			System.out.println("right angle");
		else 
			System.out.println("not a right angle");
		//8
		double temp1 = 3, temp2 = 8.5;
		double factor = 9;
		double variable = 5;
		if ((temp1-temp2)> 2.3)
			variable = (temp1-temp2)*factor;//cannot define here double variable, if having {} -> can define here
		//9
		int numberOfCredits = 200;
		if (numberOfCredits>=122)
			System.out.println("She's ready to graduate");
		//November4, 2016
		//int x = 0;
		if(3 != x ){
			System.out.println("x is 3, fool!");
		}
		else
			System.out.println("x is 3, cool!");
		System.out.println(!(!true));//not not true = true
		
		boolean ddOpen = true;
		if(!ddOpen){// if (ddOpen){ or if ddOpen == true{
			System.out.println("Come on in, have a donut!");
		}
		else
			System.out.println("Come back tomorrow, ya hear!");//run this line -> set (ddOpen: true), false, run this line
	
	String yoda = "Strong with the force you are";
	if(yoda == "Strong with the force you are"){//if (yoda.equals("Strong with the force you are")){
		System.out.println("These are the same!");
	}
	else
		System.out.println("These are different!");
	
	char gender = '0';
	
	if(gender == 'F')//single quote
		System.out.println("Hellp, Ma'am");
	else if(gender == 'M')
		System.out.println("And a good day to you too!, Sir");
	else 
		System.out.println("Top o' the mornin' to ya");//run this
	
	}
}
