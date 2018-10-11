import java.util.ArrayList;
import java.util.List;

public class Question7 {
public static void filter(ArrayList<Object> list1, ArrayList<Object> list2){
	//can I compare objects = == operator?
boolean removed = false;
Object commonValue = list2.get(0);
		for(int i = 0; i< list2.size(); i++){
			//for(Object k: list1){
			//why doesnt this work?
			 commonValue = list2.get(i);
			for(int j = 0; j< list1.size(); j++){
				if(list1.get(j) == commonValue){
					//list2.remove(list2.get(i));
					list1.remove(j);
					j--;
					 removed = true;
					// list2.remove(list2.indexOf(commonValue));
					
				}
		
			}
//			if(removed)
//				i--;
//			removed = false;
			if(removed){
				for(int h = 0; h < list2.size(); h++){
					if(list2.get(h)==commonValue){
						list2.remove(h);
					//list2.remove(list2.get(i));
						h--;
					}
				}
				i--;
			}
			removed = false;
		}
//		for(Object k: list1){
//			for(Object h: list2){
//				if(h==k){
//					list2.remove(h);
//					list1.remove(k);
//				}
//					
//			}
//		}

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList<Object> list2 = new ArrayList<Object>();
		Integer[] list01 = {1,3,5,2,1,0,3,1,4,-7};
		Integer[] list02 ={ 4,4,5,1,3,2,0,-8,1,2,-9,5,6,3};
		for(int i = 0; i < list01.length; i++){
			list1.add( list01[i]);
		}
		for(int i = 0; i < list02.length; i++){
			list2.add( list02[i]);
		}
		System.out.println(list1);
		System.out.println(list2);
		filter(list1, list2);
		System.out.println(list1);
		System.out.println(list2);
		}

}
