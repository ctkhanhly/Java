//encapsulate: wrap up over smaller classes
public abstract class LivingQuarters extends Building{
	Address address;
	private int bedrooms;
	private int baths;
	private boolean laundry;
	//livingquarters is superclass of house and apartment
	//house and apartment are subclasses of superclass
	//subclasses inherit all public fields and methods from superclass
	//if livingquarters extends/ is subclass of another class
	//apartment is also same type as that class/inherit that class
	//if livingquarters does not extend anything, it automatically extends object
	//just like any other class
	//in every subclass, you can override a superclass
	
	
	//if dont specify anything, any constructor- default constructor
	
	
	//even if we cant construct instance for this class(abstract)
	//can use this in subclass
	public LivingQuarters(){
		
	}
	public LivingQuarters(Address a, int br, int b){
		address = a;
		bedrooms = br;
		baths = b;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBaths() {
		return baths;
	}
	public void setBaths(int baths) {
		this.baths = baths;
	}
	public void setLaundry(boolean b){
		laundry = b;
	}
	public boolean hasLaundry(){
		return laundry;
	}
	public abstract void draw();
	//abstract: we're not gonna define function the method here
	//any subclass must define and have this method
	//if you define an abstract method in a class
	//you have to define the whole class abstract.
	
	
	//abstract class because forcing anybody extending this class 
	//to have specific methods
	
	public String toString(){
		return address + "\n" + bedrooms + " bedrooms, " +
				baths + " baths";
	}
}
