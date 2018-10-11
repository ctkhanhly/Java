
public class MergeSort {
//divide into 2 
	//merge arrays
	public static void swap(int[] list, int a, int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
	public static int[] partList(int[] list, int a, int b){
		int[] listTemp = new int[b-a+1];
		for( int i = 0; i<listTemp.length; i++){
			listTemp[i] = list[a+i];
		}
		return listTemp;
	}
	public static int[] merge(int[] a, int[] b){
		int[] list = new int[a.length+ b.length];
		for(int i = 0; i<list.length; i++){
			for(int j = )
			if(a[i]<b[i] )
				list[i] = a[i];
			else if(a[i]>=b[i])
				list[i]
		}
		return list;
	}
	public static int[] sort(int[] list){
		int n = list.length;
		if(n == 2){
			swap(list, list[0], list[1]);
			return list;
		}
		else if(n==1)
			return list;
		else{
			list = merge(sort(partList(list, 0, (int)n/2-1)), sort(partList(list,(int)n/2, list.length-1)));
		}
		return list;
	}
	
}
