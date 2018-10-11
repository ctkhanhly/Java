
public class BinarySearch {
	public static boolean search(int[] list, int target){
		int start = 0;
		int end = list.length -1;
		for ( int middle = (int)list.length/2; start != end; middle = (int)(end-start)/2){
			if(target == list[middle])
				return true;
			else if( target< list[middle]){
				end = middle -1;
			}
			else{
				start = middle +1;
			}
				//start<=end
		}
		return false;
	}
	public int search(int[] list, int target, int start, int end){
		int mid = (int)list.length/2;
		if(target == list[mid])
			return target;
		else if(target < list[mid]){
			return search(list, target, start, mid-1);
		}
		else if(target < list[mid]){
			return search(list, target, mid+1, end);
		}
		else
			return -1;
		
	}
}
