import java.awt.Point;
import java.util.ArrayList;

public class Day_3 {
	public static void main(String[] args){
		
		Point a = new Point(0,0);
		Point b = new Point(3,4);
		Point c = b;
		//30mb free, each point 3mb
		ArrayList<Point> myPoints = new ArrayList<Point>();//30mb - 0 free
		ArrayList<Point> myPointsAgain = new ArrayList<Point>();
		ArrayList<Point> myPointsTwo = myPointsAgain;
		
		
		
		//multiple objetcs that have multiple references
		myPoints.add(b);//30mb - 0 free
		//myPoints.add(c);
		myPoints.add(a);//30mb- 0 free
		
		//b == myPoints.get(0);
		b.setLocation(4,5);//see if b is the same object
		
		myPointsAgain.add(a);
		System.out.println(myPoints);
		System.out.println(myPointsAgain);
		System.out.println(myPointsTwo) ;
		
		
		myPoints.trimToSize();//size of myPoint: 10(or other default capacity), but only need 3, trim it
		//free all I dont use, now 24mb free
		//save space in the program
		//if added now 1 point, initialize other + default capacity automatically
		myPoints.add(c);//add empty blocks after trim => less efficient
		//add to the end
		myPoints.add(0,c);//extend length of array, take all elements move along 
		//trim makes this less efficient
		myPoints.get(2);//just get, not move anything, efficient, trim does not make this more/less efficient
		myPoints.set(2,c);//just set, same w get method, trim does not make this more/less efficient
		
		System.out.println(myPoints);
		//2D arraylist
		ArrayList<ArrayList<String>> myPoints2 = new ArrayList<ArrayList<String>>();
		ArrayList<String> s = new ArrayList<String>();
		myPoints2.add(s);
		myPoints2.get(0);
		System.out.println(myPoints2);
		myPoints2.get(0).add("Heyo!");
		System.out.println(myPoints2);
	}
}
