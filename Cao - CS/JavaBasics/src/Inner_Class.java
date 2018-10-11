 
public class Inner_Class {

	public static void main(String[] args){
		Outer out = new Outer();
		out.show();
	}
}
//The scope of class C and Inner_Class can understand Outerclass- same scope
//but not inner class
	class Outer{
		public void show(){
			Inner in = new Inner();
			in.display();
		}
		K ka = new K();
		class Inner{
			public void display(){
				System.out.println(" I am an inner class");
				ka.show();
			} 
			
		}
	}
	class K{
		public void show(){
			//error
			//Inner inner = new Inner();//import or create class inner class
			Outer.Inner in = new Outer().new Inner();//or import Inner
			//import to use another class - not within the same bigger wrapper.
			in.display();
		}
	}
//As with instance methods and variables, 
//an inner class is associated with an instance of its enclosing class
//and has direct access to that object's methods and fields. 
//Also, because an inner class is associated with an instance, 
//it cannot define any static members itself.
	
//There are two special kinds of inner classes: 
	//local classes and anonymous classes.



