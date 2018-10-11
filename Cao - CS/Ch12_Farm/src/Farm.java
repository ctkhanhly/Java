
import java.util.ArrayList;

public class Farm {
	public static void main(String[] args){
		//Initialize all Locations on the farm.
		Location barn = new Location("Barn");
		Location northField = new Location("North Field");
		Location horsePen = new Location("Horse Pen");
		Location house = new Location("House");
		Location eastPen = new Location("East Pen");
		Location pond = new Location("Pond");
				
		//Initialize animals and plants
		Horse harry = new Horse(barn, 3);
		Horse steve = new Horse(northField);
		Pig wilbur = new Pig(eastPen);
		Pig jane = new Pig(pond, 1);
		
		//set Pig servings
		wilbur.setServings(3);
		jane.setServings(5);
		
		Strawberry berryBush = new Strawberry(house, 10);
		Strawberry strawberry = new Strawberry(eastPen, 8);
		
		ArrayList<Edible> menu = new ArrayList<Edible>();
		menu.add(wilbur);
		menu.add(jane);
		menu.add(berryBush);
		menu.add(strawberry);
		
		for(Edible e: menu){
			System.out.println(e.toString());
		}
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(harry);
		animals.add(steve);
		animals.add(wilbur);
		animals.add(jane);
		
		for(Animal a : animals){
			System.out.println(a);
		}
		
		harry.move(eastPen);
		jane.move(house);
		harry.eat(wilbur);
		jane.eat(strawberry);
		
	}
}
