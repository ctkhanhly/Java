import java.io.File;//command shift o
//import to use class from another package
//import [package name].[class name];
//java.io is the package
//File is name of the class

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room.area = 500;// does not need an instance to be called
		//the same value for all Room's instances
		Room r1 = new Room();
		r1.area = 300;
		Room r2 = new Room();
	//r2.area = 300 as well
		File f = new File("fileName");
	}
}
	class Room{
		//if room is an inner class, static field has to be declared final
		static int  area = 200;//static field has to be intialized
		int number;
		
		public static void show(){
			System.out.println("Show");
			area = 500;
			//cannot use a non-static field in a static method
			//number = 0;
			
		}
	}

	
	
