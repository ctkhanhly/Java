
public class Car 
{
	private String name;
	private int speed;
	private boolean running;
	
	//CONSTRUCTORS:
	public Car()
	{
		name = "Mercedes";
		speed = 50;
		running = true;	
	}
	public Car(String n, int v, boolean r) //instead of v, can name it speed.
	{
		name = n;
		speed = v;
		running = r;
	}
	public String getName()
	{
		return name;
	}
	public int getSpeed()
	{
		return speed;
	}
	// This method will appear "true" if the variable speed is not equal to 0, otherwise, 
	//this method will run false if the speed variable is 0
	public boolean isRunning()
	{
		if (speed != 0){
			running = true;
		}
		else{
			running = false;	
		}
		return running;
	}
	//this method helps us to set an arbitrary value in Tester class for the speed variable
	// without the need to return any value from the fields/constructors of this class in the Tester class
	// of this class
		public void setSpeed(int s)
		{
			speed = s;
		}
}
