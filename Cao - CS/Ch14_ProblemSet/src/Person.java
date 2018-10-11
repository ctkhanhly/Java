//
public class Person implements Comparable<Person>{
	private String FirstName;
	private String LastName;
	
	public Person(String firstName, String lastName){
		FirstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int compareTo(Person other){
		if(LastName.compareTo(other.getLastName())==0)//other.LastName?
			return FirstName.compareTo(other.getFirstName());
		else
			return LastName.compareTo(other.getLastName());
	}
}
