
public class SelectiveSort {
	public void swap(int[] list, int a, int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
	public void search(int[] list){
		for(int i = 0; i < list.length-1; i++ ){
			int min = list[i+1];
			for(int j = i+2; j < list.length-1; j++ ){
				int lastMin = i+1;
				if(list[lastMin]<list[j]){
					min = lastMin;
				}
				else if(list[lastMin ]== list[j]){
					min = lastMin;
				}
				else
					min = j;
			}
			if(min<list[i]){
				swap(list, min,i);
			}		
		}
	}
}
