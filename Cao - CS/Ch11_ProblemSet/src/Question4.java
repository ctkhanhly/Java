import java.util.ArrayList;

public class Question4 {
public static void main(String[] args){
	//output: [0,1,2,0,1,2]
	//test:
	ArrayList<Integer> first = new ArrayList<Integer>();//when 1st cannot be variable?
	first.add(0);
	first.add(1);
	first.add(2);
	first.add(0,0);
	first.add(1,1);
	first.add(2,2);
	System.out.println(first);
}
}
