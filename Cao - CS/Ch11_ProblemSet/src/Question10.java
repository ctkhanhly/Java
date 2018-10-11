import java.util.ArrayList;

public class Question10 {
	public static void removeConsecutiveDuplicates(ArrayList<String> first){
		//String lastElement = "";
	for(int i = 1; i < first.size(); i++){
		//lastElement = first.get(i-1);
		if(first.get(i).equals(first.get(i-1))){
			first.remove(i);
			i--;
		}
//		else{
//			lastElement = first.get(i);
//		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> string = new ArrayList<String>();
		String[] model = { "Mama","Mama","Mama", "papa", "forever","forever", "something"};
		for(int i = 0; i < model.length; i++){
			string.add(model[i]);
		}
		removeConsecutiveDuplicates(string);
		System.out.println(string);
	}

}
