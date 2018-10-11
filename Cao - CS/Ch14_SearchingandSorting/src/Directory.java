import java.lang.reflect.Array;
import java.util.Arrays;
	
public class Directory {
	public static void print(Employee[] a){
		for(Employee p: a){
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getAge());
		}
	}
	public static void main(String[] args) {
		Employee[] employees = {
				new Employee(7, "Lee", 4),

				new Employee(5, "Jane", 28),

				new Employee(1, "Jorge", 19),

				new Employee(6, "May", 34),

				new Employee(3, "Michel", 10),

				new Employee(7, "Lisa", 8),

				new Employee(4, "Clerk",16 ),

				new Employee(8, "Lee", 40),

				new Employee(2, "Mark", 30)

				};
		
		
		
//		Employee a = new Employee(1, "Sam",12);
//		Employee b = new Employee(3, "Jess",21);
//		Employee k = new Employee(1, "Krist",13);
//		Employee c = a;

		
		//equals
//		System.out.println(a.equals(b));//false
//		System.out.println(a.equals(c));//true, origianl method
//		System.out.println(a.equals(k));//overridden method
		//to compare certain contents of objects rather than their addresses( if they are the same objects,
		//exact same contents) objects == objects
		//some programmers make equals return false if parameter is of incompatible type\
		//=> be careful to have correct type parameter
		//e.g: an enployee object has equals("USA"), "USA" is a string, not employee
		//ClassCastException - cannot cast a string into a country
		//the purpose of this is to be helpful in polymorphical situations, such as
				//objects of different class in ArrayList, contains, indexOf
				
		
		//compareTo(other) - Comparable interface- same object as comparable<object>
		//return -, 0 , or + ------>integer
		//- if this < other
		//0 if this = other
		//+ if this > other
		//certain methods expect objects passed to them Comparable
		//e.g: Arrays.sort(Object[] arr)--- compare elements of arr by calling their compareTo method
		//String, Integer, Double and several other library classes implement Comparable
		//make compareTo agree with equals
		//x.equals(y) returns true if and only if x.compareTo(y) returns 0.
		//Array.sort(employees)
		
		print(employees);
		System.out.println();
		Arrays.sort(employees);//go to my employee find compareto method
		print(employees);
		
		
		Arrays.sort(employees, new IdComparator());
		System.out.println();
		print(employees);
		
		Arrays.sort(employees, new AgeComparator());
		
		//compare(object1, object2) - comparator interface
		//(T[], Comparator object)
		//return -, 0 , or +
		//natural ordering: order u define in ur compareTo method
		//to pass comparators as parameters to constructors and some methods of ur own classes
		//different ways of comparing objects of your class = creating different comparators
		//Array.sort(employees, new PopulationComparator(true);
		
		//Sequential search (Linear Search)
		
//		for( e: employees)
//			if e.id = target
//			return e;
		
		//Binary Search
		//Big O Notation

	}

}
