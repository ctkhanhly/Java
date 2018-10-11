,import java.awt.Color;
import java.util.Scanner;

public class ProblemSet {
	//1
	// three relational operators: 1: < in isInside, 2: >= and <= in isOnBorder
	//1 logical operator: && in isOnBorder
//	 public boolean isInside(int x, int y)
//	  {
//	    return distance(x, y) < 0.9 * radius;
//	  }
//	 public boolean isOnBorder(int x, int y)
//	  {
//	    double d = distance(x, y);
//	    return d >= 0.9 * radius && d <= 1.1 * radius;
//	  }

	
//2
	public static int max(int x, int y)
	{
		if (x>y)
			return x;
		else
			return y;
	}
//3
	public static int max3(int x, int y, int z)
	{ 
		return max( x, max( y, z ));//because there is max of 2 method above
	}
//	public static int max3(int x, int y, int z)
//	{ 
//		return Math.max(x, Math.max(y, z));
//	}
//	public static int max3(int x, int y, int z)
//	{
//		if (x>y && x>z)
//			return x;
//		else if (x>y && x<z)
//			return y;
//		else 
//			return z;
//	}

//4

	public static boolean ifPerfectSquare(int n)
	{	
		//left-hand side of the if statement must be a variable
			return n*n == Math.pow((int)(Math.round(Math.sqrt(n))),2);
			//cast to int bc round returns long
	}
	//5
	public double totalWages(double hours, double rate)
	{
		double wages;
		if (hours<=40)
			wages = hours*rate;
		else
			wages = 40*rate + (hours-40)*rate*1.5;
		return wages;
		//wages = hour*rate
		//wages += (hours-40)*rate*1.5; ***
	}
	//6
	
//	//boolean XOR = a == true || b == true;//wrong
////	boolean XOR = a != false || b != false;//wrong
////	boolean XOR = !(a == true && b == true);//wrong
	//(a && !b) || (!a && b)
	//( a|| b) && !(a && b)
//	//boolean XOR = !(a==b);
//	boolean XOR = a != b;
	//boolean XOR = (a == true || b == true) && a!=b;


//7C !(a || !b) = !a && b
	
	//8
	//(a)// !((!x || !y) && (a || b)) 
	//x && y || !a && !b
	//(b)// if (! (x == 7) && ! (x > 7)) 
	//if ( x != 7 && x<7)
	//if (x<7)
//9
	//(a)// if ((((x+2) >a) || ((x - 2) < b)) && (y>= 0)) 
	//if (( x+2 > a || x-2 < b) && y >= 0)
	//(b)// if (((a >= b)  && (a >= c)) && ((a % 2) == 0)) 
	//if (a >= b && a>= c && a%2 == 0)
//10

//	if (Math.sqrt(x) < 3 || x > 7)
	
	//11
	//why comparing double values for exact match may not work?
	//when do I need to use public static void main? - to start every program
	
	int a = 1;
	int b = 1;
	int c = 3;// ?
	//a!=0 && b!=0 && c!= 0 && (double)a/b == (double)b/c;
	boolean x = a!= 0 && b!= 0 && c!=0 && a*c==b*b;
	//a*b*c != 0
	
	//why is this wrong
// public static boolean haha(int a, int b, int c){
//	if (a!= 0 && b!= 0 && c!=0 && a*c==b*b)
//		return true;
//	}
//	if (a!==0 && b!==0 && c!== 0 && (double)a/b == (double)b/c)//wrong
//			return true;
 //}



	
	//12
	//(a) boolean inside = !((x < left) || (x > right) || (y < top) || (y > bottom));
	//boolean inside = !(x<left) && !( x > right) && ! (y < top) && !(y > bottom);
	//boolean inside = (x >= left && x<= right && y >= top && y <= bottom);// parentheses****
	//(b) boolean no = (ch[0] == 'N' && ch[1] == 'O') || (ch[0] == 'n' && ch[1] == 'o') 
	//|| (ch[0] == 'N' && ch[1] == 'o' || (ch[0] == 'n' && ch[1] == 'O');
	//boolean no = (ch[0] == 'N' || ch[0] == 'n') && (ch[0] == 'O' || ch[0] == 'o');
	
	//13
	public boolean isLeapYear( int year){
		return (year%4 == 0 && ( year%100 != 0 || year%400 ==0));
			
	}
	//14
	public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
	{
		if (year1>year2) 
			return true;
		else if ((year1 == year2) && (month1>month2))
			return true;
		else if ((year1 == year2) && (month1==month2) && (day1>day2))
			return true;
		else
			return false;
		//return (year1>year2) || (year1 == year2) && (month1>month2) || year1 == year2) && (month1==month2) && (day1>day2);
	}
	
	//15
	if (avg <60)
		grade = 'F';
	else if (avg <70)
		grade = 'D';
	else if (avg <80)
		grade = 'C';
	else if (avg <90)
		grade = 'B';
	else 
		grade = 'A';
	
	//16
	//(a)
	
//	//(b)
//		boolean warm = false;
//		if (location.isTropics()) 
	//warm = true;
		//else if ((time.getMonth()==4 || time.getMonth()==10) && weather.isSunny())
	//warm = true;
	//else if (location.isNorthernHemisphere() && time.getMonth()>=5 && time.getMonth() <=9) 
	//warm = true;
	//else if (location.isSouthernHemisphere() && (time.getMonth() >= 11 || time.getMonth() <=3))
//			warm = true;
//	//(c)
//		boolean warm = ((location.isTropics()) || ((time.getMonth()==4 || time.getMonth()==10) && weather.isSunny()) || ((location.isNorthernHemisphere()) && (time.getMonth()>=5 && time.getMonth() <=9)) || ((location.isSouthernHemisphere())&&(time.getMonth() >= 11 || time.getMonth() <=3))); 
////17
		//(a)
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
	//18
	public Color bestMatch(int r, int g, int b){
		
		if (r!= g && r!=b)
		{ 
			if (Math.max(Math.max(r,g), b) == r)
				return Color.RED;
			else if (Math.max(Math.max(r,g), b) == g)
				return Color.GREEN;
			else 
				return Color.BLUE;
		 
		}
		else if (r==g && r!=b)
			return Color.YELLOW;
		else if (r==b && r!=g)
			return Color.magenta;
		else if (b==g && b!=r)
			return Color.CYAN;
		else
			return Color.GRAY;
	}
	//19
	public int findBestFit(int size1, int size2, int space)
	{
		int x;
		if (size1+size2 <= space)
			x = 3;
		else if (size2<= space && size1<= space && size1>=size2)
			x = 1;
		else if (size2<= space && size1<= space && size1<size2)
			x = 2;
		else 
			x = 0;
		return x;
	}
	//20
	public class Die {
		private int numDots;
		private int numFaces;
		public Die(){
			numFaces =6;
		}
		public Die(int n){
			numFaces = n;
		}
		public void roll()
		{
			numDots = (int)(numFaces*Math.random()+1);
		}
		public int getNumDots(){
			return numDots;
		}
	}
//22
	//One, two, buckle your shoe;
	//Three, four, shut the door;
	//Five, bye;
//	Scanner hehe = new Scanner(System.in);
//	
//	System.out.println("Enter a number 1-10 (or 0 to quit: ");
//	int n = hehe.nextInt();
//	
//	switch(n){
//	case 0:
//		System.out.println("Bye");
//		break;
//	case 1:
//	case 2:
//		System.out.println("Buckle your shoe");
//		break;
//	case 2:
//		System.out.println("Sit down");
//		break;
//	case 3:
//		System.out.println("Turn around");
//		break;
//	case 4:
//		System.out.println("Shut the door");
//		break;
//	case 5:
//		System.out.println("Let's talk about the issue!");
//		break;
//	case 6:
//	case 7:
//	case 8:
//	case 9:
//	case 10:
//	default: 
//		System.out.println("Oops, only 1-10!");
//		break;
		
	//}
	
	}


                                            