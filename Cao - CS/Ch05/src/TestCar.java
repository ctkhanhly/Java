
public class TestCar {
	
	public static void main(String[] args)
	{
		Car LyCar = new Car("Toyota", 100, true);
		LyCar.setSpeed(120);
		System.out.println(LyCar.isRunning());
		LyCar.setSpeed(0);
		System.out.println(LyCar.isRunning());
	}
}
