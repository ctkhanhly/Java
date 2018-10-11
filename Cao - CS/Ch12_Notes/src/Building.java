
public class Building {

	private Address address;
	//any object is initialized to null
	//no constructor at all -> inherits no arg constructor from Object
	//if there is 1 constructor that has parameter
	//-> has to define no arg if wants to instantiate an object with no-arg constructor
	//
	
	public Building(){
		address = new Address();
	}
	public Building(Address a){
	address = a;
	}
	
	public String toString(){
		return address.toString();
	}
	public Address getAddress(){
		return address;
	}

	

}
