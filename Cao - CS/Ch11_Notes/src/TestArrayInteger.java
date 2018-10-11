import java.util.ArrayList;
import java.awt.Point;
public class TestArrayInteger {
public static void main(String[] args){
	ArrayList<String> a = new ArrayList<String>();
	a.add("Hello");
	a.add("World!");
	a.add("World!");
	a.add("World!");
	a.add("World!");
	a.add("World!");
	a.add("World!");
	a.add("World!");
	a.add("World!");
	a.add("haha!");
	a.add("hoho!");
	System.out.println(a);
	
	Point p = new Point();
	Integer i =3;
	ArraySubClass aList = new ArraySubClass();//<Object>
	aList.add("Hi");//any object
	aList.add(i);//any object
	aList.add(p);
	System.out.println(aList);
	int[] b = {1,2,3,4,5,6};
	System.out.println(b);
}
}
