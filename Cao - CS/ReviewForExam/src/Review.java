import java.util.ArrayList;
import java.util.Arrays;

public class Review {
private static String n;//initialized to null
private static int h;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Addition[] j= new Addition[5];
		String m= "haha";
		System.out.println("<" +m.substring(0, 0)+ ">");//<>
		//System.out.println("<" +m.substring(0, 5)+ ">");//StringIndexOutOfBoundException
		//System.out.println("<" +m.substring(-1, 2)+ ">");//StringIndexOutOfBoundException
		System.out.println(Addition.add(2,3));
		//System.out.println(Addition.add(1.0, 3.0)); this is static reference
		Addition a = new Addition();//derived from Object class
		System.out.println(a.add(1.0, 3.0));
		//System.out.println(0/0);//ArithmeticException
		System.out.println(6%14);//6
		System.out.println(n);
		System.out.println(h);
		String k = null;
		System.out.println(k.substring(0, 0));//null pointer exception
		String l = "";
		System.out.println(l.substring(0, 0));//print nothing
		System.out.println(false&&false);
		
		//ARRAYLIST
		//indexOf(Object obj)
		//contains(Object obj)//boolean
		//arraylist can contain various references to an object
		//cannot add to a position exceeding my size
		//s.add(2, "haha");//add at position 2
		ArrayList<String> s = new ArrayList<String>(2);//specify the type
		//<> has to be object, cant be primitive data type
		//ArrayList<int> s = new ArrayList<int>();, wrong
		
		String like = "And I was like like and she was like and I was like and he was like";
		String[] likeWords = like.split(" "); // into this element, each sentence split up as a space
		//***** split method
		
		
		//Arraylist implements list?
		
		
		//equals
//		public boolean equals(Object other){//in order to override, has to same type of parameter
//			return this.id == ((Employee)other).id;
//		}
		//== operator: comapare addresses
		
		//some programmers make equals return false if parameter is of incompatible type\
		//e.g: an enployee object has equals("USA"), "USA" is a string, not employee
				//ClassCastException - cannot cast a string into a country
		//e.g: Arrays.sort(Object[] arr)--- compare elements of arr by calling their compareTo method
		//Arrays.sort(employees, new AgeComparator());
		//compare(object1, object2) - comparator interface
				//(T[], Comparator object)
		
		//compare
//		public int compare(Employee e1, Employee e2){//different classes
//			if( e1.getId() == e2.getId()){
//				return e1.getAge() - e2.getAge();
//			}
//			else
//				return e1.getId() - e2.getId();
//		}
		
		//compareTo
//		public int compareTo(Employee other){
//			//return this.id - other.id;
//			if(name.compareTo(other.getName())==0){
//				return age - other.age;
//			}
//			return name.compareTo(other.getName());//string class has a compareTo method
//		}
		
		//ABSTRACT
	}

}
