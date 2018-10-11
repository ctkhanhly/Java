
public class SearchSequential {
//	public static boolean search(int[] list, int target){
//		for(int i :list){
//			if (i == target)
//				return true;	
//		}
//			return false;
//	}
	public static int search(int[] list, int target){
		for(int i :list){
			if (i == target)
				return i;	
		}
			return -1;
	}
}
