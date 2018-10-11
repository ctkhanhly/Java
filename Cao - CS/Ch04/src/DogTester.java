
public class DogTester {
	//every program starts with public main
	public static void main(String[] args){
		Dog lizDog = new Dog(); //going to constructor in Dog.java, has all atrributes of Dog.java; ()call constructor
		lizDog.bark(); //method just made in Dog class
		lizDog.bark();
		lizDog.bark();
		lizDog.bark();
		lizDog.bark();
	
		Dog brookeDog = new Dog("beagle", "Rocky", 14); // is  a default, not have any attribute, find default constructor and its attribute
		brookeDog.bark();
		
		System.out.println(lizDog.getName());// GERALD
		System.out.println(brookeDog.getName());// Rocky
	
		//System.out.println(lizDog.setAge(7));//error.
		//lizDog.setAge(7); is void, not interger, will not print
		System.out.println(lizDog.getAge());//2
		lizDog.setAge(7);//this is an object, taking different characteristics of the same field of class
		System.out.println(lizDog.getAge());//7
		//System.out.println(brookeDog.age);// to access public field,( instead of private int age-> public int age) total access to this variabl, outside of the class
		//brookeDog.age = 4; // public, want private b/c dont want this
		//brookeDog.name = "Joe"; //cannot access this b/c private
		
		lizDog.setName("Lulu");
		lizDog.setBreed("Corgi");
		lizDog.setAge(8);
		System.out.println("Your Dog is " + lizDog.getName() + ". It is a " + lizDog.getAge() + " year old "+ lizDog.getBreed());
		
		SmallDog smalls = new SmallDog("Yorkie", "Pinky", 1);
		smalls.bark(); //yip!
		System.out.println(smalls.getName());//using default constructor from Dog class b/c not yet constructor from SmallDog
		// Gerald- no parameter; with parameter: Pinky
	}
	
}
