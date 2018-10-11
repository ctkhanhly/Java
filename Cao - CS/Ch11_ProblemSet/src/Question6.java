import java.util.ArrayList;

public class Question6 {
public static void removeMin(ArrayList<Integer> someInt){
	//int[] random = new int[someInt.size()];
	int min = 0;
	int previousMin = 0;
	for(int i = 0; i<someInt.size()-1; i++){
		if(someInt.get(i).compareTo(someInt.get(i+1))<=0){
			previousMin = min;
			min = Math.min(someInt.get(i).intValue(),previousMin);
		}
		else{
			previousMin = min;
			min = Math.min(someInt.get(i+1).intValue(),previousMin);
		}
	}
//	for(Integer i:someInt){
//		if(i.intValue() ==min){
//			someInt.remove(min);
//		}
//	}
	Integer hihi = min;
	someInt.remove(hihi);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] random = {4,5,1,3,-10,2,4};
		ArrayList<Integer> someInt = new ArrayList<Integer>();
		for(int i = 0; i< random.length; i++){
			someInt.add(random[i]);
		}
		removeMin(someInt);
		System.out.println(someInt);
	}

}
