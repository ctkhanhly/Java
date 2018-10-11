
public class SmallDog extends Dog// subclass o∑f Dog class, all fields, methods of Dog
{
	public SmallDog(){
		super(); // call back constructor of Dog class that does not have parameter- Corgi etc
	}
	public SmallDog(String breed, String name, int age){ // i dont want type field, breed b etc again; type in my values and throw it into my superclass
		super(breed, name, age);// i dont define these here, but in my superclass
	}
	public void bark(){ //override dog bark method- define same name as one method of Dog class, but will use this one
		System.out.println("yip!");
}
}