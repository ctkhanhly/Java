import java.awt.Color;

public class Dog {
	//FIELDS: attribute (type of object that holds a ... is a string, determine if public or private)
	//hold a string of characters
	private String breed;
	private String name;
	private int age; //public int age
	private Color color; 
	
	//CONSTRUCTOR ( public b/c access from another file, construtor has the same name as class)
	public Dog(){ // default field to default initial; () no value inside
		breed = "Corgi"; 
		name = "Gerold";
		age = 2;
		
		//2 constructors
	}
	public Dog(String b,String n, int h){ //whaterver variable, not neccessarily b.g.h; String b...-> parameters, 
		breed = b;
		name = n;
		age = h;
	}
	//METHODS
	//void - int (return sth)
	public void bark(){ 
		System.out.println("RUFF");
	}
	public String getName()
	{ // want sth in return
	return name;
	}
	public String getBreed()
	{
	return breed;
	
	}
	public int getAge()
	{ // getAge: encapsulate private, : private only here
	return age; //give back information
	}
	public void setAge(int a){  //dont want to return, only change age, dont need confirmation, parameter in ()-> use void
		age = a; //whatever a is
	}
	public void setName(String n){
		name = n;
	}
	public void setBreed(String b){ // String is a parameter
		breed = b;
	}
	}
	

