
public class InsertionSort {
	public static void swap(int[] list, int a, int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
//	public int[] sort(int[] list, int index){//index =1
//		if(index==list.length-1)
//			return list;
//		else{
//			for(int i = index; i>0; i--){
//				if(list[i]< list[i-1])
//					swap(list, i, i-1);
//			}
//			list = sort(list, index++);
//		}
//		return list;	
//}
	public static int[] sort(int[] list, int index, int j){//index =0, j= 1
		
		if(index == list.length-1 && j == 0)
			return list;
		else{
			if(list[j-1]<= list[j]){
				swap(list, j, j-1);
				return list;
			}
			else{
				list = sort(list, index,j-1);
			}
			list = sort(list, index+1, j);
		}
		return list;
	}
}
