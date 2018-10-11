import java.util.ArrayList;

public class Question5 {
public static ArrayList<String> add(ArrayList<String> whatever){
	whatever.add("haha");
	return whatever;
}
public static ArrayList<String> reverse(ArrayList<String> whatever){
	//ArrayList<String> temp = ArrayList<String>(whatever);
	ArrayList<String> temp = new ArrayList<String>();
	for(int i = whatever.size()-1; i >=0; i--){
		//for(int j = 0; j < whatever.size(); j++){
			temp.add(whatever.get(i));
			//can only use add(i, element) if known size?
		//}
	}
	return temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] whatever = { "lala", "hooho", "hihi"};
		ArrayList<String> what = new ArrayList();//size of what is now 0
		for(int i = 0; i < whatever.length; i++){
			//what.set(i, whatever[i]);//----why cant this work
			//because size is 0?
			what.add( whatever[i]);
		}
		//what.set(0, whatever[0]);
		System.out.println(what);
		add(what);
		System.out.println(what);
		
		
		System.out.println(reverse(what));
		//System.out.println(what.reverse(what));--- why does this line have an error
		System.out.println(what);

	}
	
	

}
