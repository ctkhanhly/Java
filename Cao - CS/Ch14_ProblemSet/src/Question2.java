import java.lang.reflect.Array;
import java.util.Arrays;
	
public class Question2 {
	public static void print(Person[] a){
		for(Person p: a){
			System.out.println(p.getLastName() + "\t" + p.getFirstName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons ={
				new Person("Ly", "Cao"),
				new Person("Perry", "Lum"),
				new Person("Paul", "Baier"),
				new Person("Lily", "Lin")
		};
		Arrays.sort(persons);
		print(persons);
	}

}
