
public class Strawberry implements Edible{
	private int cals, servings;
	private Location loc;
	
	public Strawberry(Location l, int s){
		loc = l;
		servings = s;
	}
	public void removeServing(){
		servings -= 1;
	}
	public int getCals(){
		return cals;
	}
	public int setCals(int cals){
		this.cals = cals;
		return this.cals;
	}
	public int setServings(int servings){
		this.servings = servings;
		return servings;
	}
	public int getServings(){
		return servings;
	}
	public Location getLocation(){
		return loc;
	}
	public String toString(){
		return "The strawberries' location is: " + loc + ", the calories they have are: "
				+ cals + ", and the servings they have are: " + servings;
	}
}
