import java.awt.Color;

public class Notes_01_09 {
	public static void main(String[] args){
		//question 14
//String is an array of characters, each position is a character, and I store it 
	// in a name 
	//Hello!
	//ch.0 ch.2 ch.3 ch.4 ch.5
	//array 50 spots : each is an integer, under 1 variable score[50]
	//each spot is individual integer
	
	//Declaring array with type and new operator
	//note different data types
	
	int[] scores = new int[5];  //name of out variable
			//[5] : has to specify length right here on the right
	//5 places for 5 integers, can only put integers in this array, this is an int array
	//default int array-> initialized 0
	//all 5 zeros
	
	String[] myStringArray = new String[3];//all 3 of them null, not empty string
	//once set length 3 cannot add more
	//copy and add to a new string to add more, but has to add to memory.
	//default: null
	//null is a reserved word, means nothing
	
	Color[] c = new Color[7];//when you create array you have to 
	//System.out.println(c);
	 boolean[] b = new boolean[10];
	 //default: false
	 //10 boolean values all false
	
	 int x =2; //index can be integer, can be variable if variable is integer
	 
	 System.out.println(b[x]);
	 
	//indices: index values/subscripts - hard coded and variable
	//starting at zero- e.g : a.charAt(0): 0 is index
	//get 1 element in our array
	
	System.out.println(scores[0]);
	System.out.println(myStringArray[0]);
	
//last element of an array is always length()-1
	//all objects initialized to null
	
	//declaring arrays with braces
	int[] y = {12, 235, 235, 32, 435, 754, 345, 34, 3};
	System.out.println(y[3]);//32
	Color[] rainbow = {Color.RED, Color.orange, Color.yellow, Color.green};
	int r = (int)Math.random()*8;
	//setBackground(rainbow[r]);
	
	//array length (indices must be between 0 and length -1)
	//length of array is a field, not a method, access with .length
	int z = y.length;
	
	//set individual array element
	System.out.println(y[0]);//12
	y[0]=5; //set it to 5
	System.out.println(y[0]);
	
	//methods manipulate ORIGINAL array
	//create swap method to show it
	int[] a = { 3,4,5,6,7};
	//print entire array
	for(int i =0; i< a.length; i++){
		System.out.print(a[i] + " ");
	}
	System.out.println();
	swap(a);//this is how to call void method
	for(int i =0; i< a.length; i++){
		System.out.print(a[i] + " ");
	}

	//int[] arr = {3,4,5};
	//arr -> {3,4,5}
	//swap(arr)
	}
	public static void swap(int[] a){
		int b = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = b;
		
	}
}
