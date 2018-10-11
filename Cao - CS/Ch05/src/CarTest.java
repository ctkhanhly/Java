
public class CarTest {
	public static void main(String[] args){
		Car benz = new Car("Mercedes", 60, true);
		Car bently = new Car("Bent", 70, true);
		//Car mercedez = new Car("Mercedez",60, true);//this is not equal to benz
		Car mercedez = benz;//appointing to the same object
		
		if (mercedez == benz)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		int x =3;
		int y =x;//not pointing to same place, different from object, this sets y=3
		x++;
		System.out.println( x+ " "+ y);
		
		System.out.println("Benz Speed: " + benz.getSpeed());
		System.out.println("Mercedes Speed: " + mercedez.getSpeed());
		benz.setSpeed(50);
		System.out.println("Mercedez Speed: " + mercedez.getSpeed());
		public boolean nearHundred(int n) {
			  if (89<x<111, 189<x<211)
			  return true;
			  else 
			  return false;
			}
	}
}
