import java.util.Scanner;
public class Notes_11_11 {
	
//	int x =3;
//switch(x)
//{
//	case 1: // if x in parameter matches 1 value in case 1, do this
//		break;
//	case 2:
//		break;
//	case 3:
//		break;
//	default://if it does not match anything, do this.(e.g in this example, x=5, do this)
//}
//	char y = 'A';
//	switch(y)//for cases, data type of case has to be same as data type of parameter.
//	{
//		case 'A':
//			//need to put at the end of every case: literally:
//			break;//once u run this, break out of switch statement, dont keep running next cases.
//			//dont have break-> keep running cases.
//		case 'B':
//			break;
//		case 'C':
//			break;
//		case Z:// not an error, just never run this.
//		default: // can have as many cases as possible
	//dont need to break b/c at this point it breaks out anyway
		//}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//int x =3;//x=6, it does not do anything
		int grade = 10;
		int effort = -1;
		switch(effort){//switch(x){
		//case 0: //print until the end of case 1
		//case 0:
		//break; // does not print anything b/c nothing in case 0.
		case 1: //1 can be substituted by a character.
			if (grade > 90)
				System.out.println("Could be better, so much potential");
			else
				System.out.println("Clearly effort is affecting arade");
			System.out.println("Poor Effort");
			break;// if there is no break, keep printing case 2 until it hits the break
			//w/o break here: print:
			//Clearly effort is affecting arade
			//Poor Effort
			//Mediocre Effort
		case 2:
			System.out.println("Mediocre Effort");
			break;
		case 3:
			System.out.println("OK Effort");
			break;
		case 4:
			System.out.println("Good Effort");
			break;
		case 5:
			System.out.println("Exellent Efort");
			break;
//		default:// like else
//			System.out.println("Who are you?");
		}
		System.out.println("enter the score: ");
		String grStr = keyboard.next();
		char score = grStr.charAt(0);
		switch (score)
		{
		case 'a':
		case 'A':// can enter A+
		case 'b':
		case 'B':
			System.out.println("good work");
			break;
		case 'c':
		case 'C':
			System.out.println("average work");
			break;
		case 'd':
		case 'D':
			System.out.println("just passing");
			break;
		case 'f':
		case 'F':
			System.out.println("poor work");
			break;
		default: 
			System.out.println("Oops there is an error!");
		}
		
		
	}
}
