
public abstract class Animal extends LivingThing{
	private double energy;
	
	public Animal(){
		energy = 100;
	}
	public boolean isHungry(){
		return energy < 10;
	}
	
	public double getEnergy(){
		return energy;
	}
	
	public double eat(Edible e){
		if(super.getLocation().equals(e.getLocation()) && e.getServings() > 0){
			energy += e.getCals();
			e.removeServing();
		}
			return energy;
	}
	
	public Location move(Location l){
		if(!isHungry()){
			super.setLocation(l);
			energy *= (double)9/10;
		}
		return super.getLocation();
	}
	public abstract void speak();
	
	public String toString(){
		return "The location is: "+ super.getLocation() +", and the energy is: " + energy;
	}
}
