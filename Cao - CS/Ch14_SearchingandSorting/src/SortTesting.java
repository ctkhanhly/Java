
public class SortTesting {

	public static void print(int[] a){
		for(int i:a)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {4,7,12,3,0,2};
		
		System.out.println(SearchSequential.search(list, 5));
		System.out.println(BinarySearch.search(list,3));
		//System.out.println(InsertionSort.sort(list, 0, 1));
		for(int i: MergeSort.sort(list)){
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
