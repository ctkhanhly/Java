
public class Location {
	private String name;
	
	public Location(String n){
		name = n;
	}
	public String toString(){
		return name;
	}
	public boolean equals(Location loc){
		return this.name.equals(loc.name);
	}
}
