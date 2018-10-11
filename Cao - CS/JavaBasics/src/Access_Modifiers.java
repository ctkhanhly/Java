
public class Access_Modifiers {

	public static void main(String [] args){
		Boss b1 = new Boss();
		System.out.println(b1.age);
		System.out.println(b1.name);
		System.out.println(b1.address);
		//System.out.println(b1.numberOfWives);// error b/c private
	}
}
class Boss{
	//Everywhere
	public int age;
	//Same package, its subclasses=> can you extend from another package?
	protected String name;
	//Same package
	String address;
	//Only for itself
	private int numberOfWives;
	
	private void showAge(){
		System.out.println(age);
	}
	void showName(){//default
		System.out.println(name);
	}
	protected void showAddress(){
		System.out.println(address);
	}
	public void showWives(){//API
		System.out.println(numberOfWives);
	}
	//encapsulation- private field, public getter.
}
//constructor- subclass's constructor cau dau tien luc nao cung phai super()
//tuy constructor cua super co nhung loai nao( tham so nao 

