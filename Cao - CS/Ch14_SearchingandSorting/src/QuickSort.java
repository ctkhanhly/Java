
public class QuickSort {
//find the right sort for the pivot each time
	public static void swap(int[] list, int a, int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
	public static int[] partList(int[] list, int a, int b){
		int[] listTemp = new int[b-a];
		for( int i = 0; i<listTemp.length; i++){
			listTemp[i] = list[a+i];
		}
		return listTemp;
	}
	public static int[] merge(int[] a, int[] b){
		int[] list = new int[a.length+ b.length];
		for(int i = 0; i<list.length; i++){
			if(i<a.length){
				list[i]= a[i];
			}
			else
				list[i] = b[i-a.length];
		}
		return list;
	}
	public static int[] sort(int[] list){
		int pivot = (int)(Math.random()*list.length);
		if(list.length==1)
			return list;
		else{
			
		for(int i = 0; i<list.length; i++){
			if(list[i]<list[pivot] && i> pivot)
				swap(list, i, pivot);
			else if(list[i]>list[pivot] && i< pivot)
				swap(list, i, pivot);
		}
		list = merge(sort(partList(list,0,pivot)),sort(partList(list,pivot,list.length-1)));
		}
		return list;
	}
}
