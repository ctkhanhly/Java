
public class House extends LivingQuarters{
//no construcot -> automatically call super()
	//if super class does not have any constructor-> call default constructor as well
	
	
	//does it always need to have super() - dont have to 
	public House(){//has to have one from super class
		//why not derived from Object class?
		//only derived if there is no constructor at all
	}
	public House(Address a, int br, int b){
		super(a, br, b);
	}
	public House(int br, int b){
		super(new Address(0, "Main Street","Somewhere","State",12345),br, b);
		//0 Main Street, Somewhere, State 12345
	}
	public void draw(){
		System.out.println("------------------");
		System.out.println("|     |    |     |");
		System.out.println("|     |    |     |");
		System.out.println("|     |    |     |");
		System.out.println("-------    -------");
		System.out.println("|                |");
		System.out.println("|                |");
		System.out.println("------------------");
	}
	public String toString(){
		return "This is a house\n" + super.toString();
	}
}
