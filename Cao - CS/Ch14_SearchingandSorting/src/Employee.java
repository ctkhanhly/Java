
public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	
	public Employee(){
		
	}
	public Employee(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public boolean equals(Object other){//in order to override, has to same type of parameter
		return this.id == ((Employee)other).id;
	}
	
	public int compareTo(Employee other){
		//return this.id - other.id;
		if(name.compareTo(other.getName())==0){
			return age - other.age;
		}
		return name.compareTo(other.getName());//string class has a compareTo method
	}
	//only 1 compareTo
}
