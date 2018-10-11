
public class FractionTest {
	public static void main(String[] args){
		Fraction f1 = new Fraction(4,6);
		//Fraction f1 = new Fraction(f1.num); //access field if its public
		f1.multiply(2);//non static methods can only get access by instance of the class
		//fraction f1 is an instance of an object, a fraction
		//instance variable- such as num, denom in fraction class
		
//STATIC METHOD cannot manipulate any instance variable, can only manipulate local variable
	//e.g: reduce method of fraction class has num, denom-> cannot be static
		//static method can get access = prefix is a class name w a dot or not at all
		//e.g
		
		//Fraction.gcf(4,26);
		//System.out.println(Fraction.count);//not specific to f1
		
		
		//for every instance of the class, count exists
		//static variable -> allocated, take memory
		//static method cannot call nonstatic method
		//instance varible-> take new memory
		System.out.println(f1.toString());
		Fraction f2 = new Fraction(f1);
		System.out.println(f2);
		
		
		
		
	}
}
