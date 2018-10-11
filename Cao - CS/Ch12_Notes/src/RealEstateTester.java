import java.util.ArrayList;
public class RealEstateTester {
//either abstract or concrete class
	//can have abstract/concrete classes extended
	//at the end of hierrachy, need concrete class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(33, "Chapel Lane", "Plymouth", "New Hampshire", 03264);
		System.out.println(a);
		//LivingQuarters n = new LivingQuarters();
		//this has error because when you make an abstract class, you cannot add instantite 
		//any instances/ create any object of livingquarters type.
		Building b = new Building();
		System.out.println(1);
		System.out.println(b.getAddress());//print nothing
		LivingQuarters h = new House();//constructor House() has to be present 
		//in House class for this to have no error
		LivingQuarters l = new Apartment();
		ArrayList<LivingQuarters> listing = new ArrayList<LivingQuarters>();
		//can still use livingquarters as a type
		listing.add(l);
//		listing.add(h);
		
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(l);//all classes extend object.
		
		for(LivingQuarters j: listing){
			j.draw();
		}
		//ArrayList extends List
		
//		Apartment b = new Apartment(a,4,5,1,true);
//		listing.add(b);
		House c = new House(a, 2,3);
		listing.add(c);
		for(LivingQuarters k : listing){
			System.out.println(k + " ");
		}
		//polymorphism
		//dependent on context, can have many forms
		
		Office quiznos = new Office(a, 10, 50);
		System.out.println(quiznos);
		
		Apartment apt = new Apartment();
		ArrayList<Leasable> leaseListing = new ArrayList<Leasable>();
		//leaseListing.add(l);//cannot add house b/c not implement Leasable
		//cannot add this because this is livingQuarters
		leaseListing.add(apt);
		leaseListing.add(quiznos);
		
		int total = 0;
		for(Leasable lea : leaseListing)
			total += lea.getCost();
		System.out.println("Total Leasable Cost: " + total);
		//u can use a type Leasable but cannot make Leasable objects
		//cannot instantiate Leasable
		//b/c it does not have any field
		//can use data type on objects -> already exist
	}

}
