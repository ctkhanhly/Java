
public class Notes11_16 {
//not every class(blueprint, u design) b/c my program does not start there, it starts in a different class
	//, but every program you run has to have main method
	//methods
	//name(){ }
	//constructor
	//name(){}
	//only thing outside curly bracket, constructor/method: fields
	//name = "steve";// cannot be outside methods/constructors/curly brackets.
	//can test right in ur class with main method below
	enum suits{ HEARTS, SPADES, DIAMONDS, CLUBS}  //~making mini class
	public static void main(String[] args){//not comparing double values//yes boolean character, integer
//		double a = 1.0000001;
//		double b = 0.0000001;
//		
//		if(a-b == 1)
//			System.out.println("They're Equal!");
//		else
//			System.out.println("NO STR!");
		suits card = suits.HEARTS;//restricted to 4 characteristics
		printCard(card);
		//if (card == suits.DIAMOND){}
		
		switch(card){
		case HEARTS:// have to use suits.DIAMOND to get access, but dont need in switch
			break;
		case SPADES:
			break;
		case DIAMONDS:
			break;
		case CLUBS:
			break;
		}
	}
	public static void printCard(suits s){// declaring another variable, card is transfered into s, 
		//only way to use card in this method is to use a parameter.
		System.out.println(s);
	}
	
}
