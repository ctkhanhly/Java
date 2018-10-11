
public class Pig extends Animal implements Edible{
	private int cals;
	private int servings;
	
	public Pig(Location l, int a){
		super.setLocation(l);
		super.setAge(a);
	}
	public Pig(Location l){
		super.setLocation(l);
	}
	public Pig(){
		cals = 30;
		servings = 50;
	}
	public void removeServing(){
		servings -= 1;
	}
	public void speak(){
		System.out.print("pig!");
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
		return this.servings;
	}
	public int getServings(){
		return servings;
	}
	public Location getLocation(){
		return super.getLocation();
	}
	public String toString(){
		return super.toString() + "There are " + cals + " calories and " + servings
				+" servings left";
	}
	
}
