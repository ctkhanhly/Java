
public class Horse extends Animal {
	
//	public Horse(Location l, energy e){
//		super();
//		super.setLocation(l);
//		super.energy = e;
//	}
	public Horse(Location l, int a){
		super.setLocation(l);
		super.setAge(a);
	}
	public Horse(Location l){
		super.setLocation(l);
	}
	public void speak(){
		System.out.print("Horse!");
	}
	public String toString(){
		return super.toString();
	}
}
