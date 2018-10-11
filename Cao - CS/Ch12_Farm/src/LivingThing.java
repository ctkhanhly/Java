
public abstract class LivingThing {
	private int age;
	private Location loc;
	
	public LivingThing(){
		age = 0;
	}
	public int getAge(){
		return age;
	}
	
	public Location getLocation(){
		return loc;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setLocation(Location l){
		loc = l;
	}
	
	public String toString(){
		return loc.toString();
	}
}
