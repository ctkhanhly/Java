
public class Apartment extends LivingQuarters implements Leasable{
	//you can extend me, but only if you include draw method
	int unit;
	boolean elevator;
	
//	public Address getAddress(){
//		return address;
//	}
//	public int getBedroom(){
//		return bedrooms;
//	}
	
	public Apartment(){
		//dont specify-> automatically call no-arg constructor of super class
		//-> has to have no-arg constructor in super class
	}
	//every subclass always calls the super class
	public Apartment(Address a, int br, int b, int u, boolean e){
		super(a,br,b);//has to be 1st statement in the method
		//w/o this super sentence, this subclass will always make the call
		//super() no-arg constructor to the super class- error because not yet no arg 
		//constructor in LivingQuarters
		unit = u;
		elevator = e;
	}
	public void draw(){
	System.out.println("------------");
	System.out.println("|     |    |");
	System.out.println("|     |    |");
	System.out.println("|     ------");
	System.out.println("|          |");
	System.out.println("------------");
	}
	public String toString(){
		return "This is an apartment\n" + super.toString(); //+ super.getBedrooms();
	}
	public int getCost(){
		return 400;
	}
}
