
public class Office extends Building implements Leasable{
	int rooms, cubicles;
	
	public Office(){
		//looking for building no-args constructor
	}
	
	public Office(Address a, int r, int c){
		super(a);
		rooms = r;
		cubicles = c;
	}
	
	public String toString(){
		return "Office Space\n" + rooms + " room card " + cubicles + " cubicles " + super.toString();
	}
	public int getCost(){
		return 100*rooms;
	}
}
