
public class Notes11_15 {
	//enumeration hyhyhy
	enum Flag {RED, WHITE, BLUE};//list of values that do not change, always constant
	//can be used inside, but have to be declared outside of any method.
	//enum is restricted
	enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	enum Planets {MERCURY, VENUS, EARTH,  MARS, JUPITER, SATURN, URANUS, NEPTUNE};
	
	public static Planets PlanetNumber(int n){
//		if(n==1)
//			return Planets.MERCURY;
		switch(n){
		case 1:
			return Planets.MERCURY;//in a method -return: already break
			//break;//never reach this, 
		case 2:
			return Planets.VENUS;
		case 3:
			return Planets.EARTH ;
		case 4:
			return Planets.MARS;
		case 5:
			return Planets.JUPITER;
		case 6:
			return Planets.SATURN;
		case 7:
			return Planets.URANUS;
		case 8:
			return Planets.NEPTUNE;
			//I need to return sth, so I need a default
		default:
			return Planets.EARTH;//I have to have a default
		}
	}
public static void main(String[] args){
	
	int i = 4;
	System.out.println(PlanetNumber(i));
	
	int x = 3;//(-2billion-2billion)
	//Days is restricted
	Days d = Days.MONDAY;//case sentitive
	
	switch(d){
	case MONDAY:
	System.out.println("Sounds like someone has a case of Monday :(");
	case TUESDAY:
		System.out.println("Tuesday");
	case WEDNESDAY:
		System.out.println("Wednesday");
	case THURSDAY:
		System.out.println("Thursday");
	case FRIDAY:
		System.out.println("Friday");
	case SATURDAY:
		System.out.println("Saturday");
	case SUNDAY:
		System.out.println("Sunday");
		}
	}
}
