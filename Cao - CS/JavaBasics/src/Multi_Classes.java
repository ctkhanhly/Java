
public class Multi_Classes {
	
	public static void main(String[] args){
		A a1 = new A();// Object no-arg constructor
		a1.setName("Duckly");
		System.out.println(a1.getName());
	}
	
}
//trong 1 class chi co 1 class dc declared public=> ten cua class
class A{
	private String name;
	
	public void setName( String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
class B{
	
}
