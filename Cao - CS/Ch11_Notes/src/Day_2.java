import java.awt.Point;
import java.util.ArrayList;
//size and capacity
//capacity default = 10
//size increases, capacity stays the same until they are equal
//then they increase capacity so we can use

public class Day_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no args constructor has- size() ==0 &
		//default capacity 10
		ArrayList<String> s = new ArrayList<String>(2);//specify the type
		//<> has to be object, cant be primitive data type
		//ArrayList<int> s = new ArrayList<int>();, wrong
		//intial capacity =2
		System.out.println(s.size());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//every primiive data type has a class
		
		
		//parameter is capacity
		//String[] str = new String[15];
		
		//add(String s){
		//str.[size] = s
		//size++
		
		s.add("Hello");//increase size by 1
		//add to the end of the array
		//increments size of the list by 1
		s.add("World!");
		s.add("Have a nice day!");
		s.add(2, "haha");//add at position 2
		//shifts the old 2nd element and all the subsequent elements to the right and increments their
		//indices by 1 and increments the size of the lsit by one
		//check if 0<= i <= list.size()
		//cannot add to a position exceeding my size
		//if i = list.size(), add(i, E elmt) works the same as add(E elmt)
		System.out.println(s.size());// posiition now b/c not add anything yet
		System.out.println(s);//toString
		
		if(s.add("bonjour"))//return true
			System.out.println("Yep!");
		System.out.println(s);
		
		s.remove(3);
		//remove ith element, shifts all subsequent elements to left by 1 and decrements their
		//indices & decrements the size of the list by one
		//returns the value of the removed element
		System.out.println(s);
		s.remove("World!");//deletete 1st occurrence of world
		s.add("World!");
		System.out.println(s);
		
		
		String two = s.get(2);
		System.out.println(s.get(2));
		
		//instead of add to beginning and then remove the old one, can use set-> > efficient
		s.set(0, "Priviet");
		System.out.println(s);//override s[0], instead of Hello, print Privet
		
		int x = 7;
		intList.add(7);
		intList.add(x); //autobox primitive int data type to object
		//this is int, but int in the object
		//if intList is Double type, it wont autobox between data type
		//wont autobox int into double object
		//arraylist can contain various references to an object
		//add method, not create new "World!" to the same reference, not creating new object
		System.out.println(intList);
//		public ArrayList<String> fiveOrLonger(ArrayList<String> words)
//		{
//			ArrayList<String> words5 = new ArrayList<String>();
//			for (String word: words)
//				if (word.length() > = 5)
//					words5.add(word);
//			
//			return words5;
//		}
//		}
//		ArrayList<Double> samples = new ArrayList<Double>();
//		samples.add(5.0);//this is the same as
//		
//		ArrayList<Double> samples = new ArrayList<Double>();
//		samples.add(new Double(5.0));
//		samples.add(5); // cant add to an ArrayList<Double>
		
		//indexOf(Object obj)
//		Java.util.ArrayList class method indexOf(Object o) is used for finding out the index 
		//of a particular element in a list.
//
//		public int indexOf(Object o)
//
//		This method returns -1 if the specified element is not present in the list.
		
		//contains(Object obj)
//		Type: System.Boolean
//		true if item is found in the ArrayList; otherwise, false.
	}


}
