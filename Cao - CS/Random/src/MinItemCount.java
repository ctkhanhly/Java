import java.util.ArrayList;

public class MinItemCount {

	public static int findMin(int[] numbers_seq){
		int min = numbers_seq[0];
		for(int i = 1; i< numbers_seq.length; i++){
			if(numbers_seq[i] < min){
				min = numbers_seq[i];	
			}
		}
		return min;
	}
	public static int min_item_count(int[] numbers_seq){
		int min = numbers_seq[0];
		for(int i = 1; i< numbers_seq.length; i++){
			if(numbers_seq[i] < min){
				min = numbers_seq[i];	
			}
		}
		int count = 0;
		for(int i = 0; i< numbers_seq.length; i++){
			if(numbers_seq[i] == min){
				count++;
			}
		}
		return count;
	}
	
	public static int[] reorder(int[] A, int n){
		int[] B = new int[A.length];
		n = B.toString().length();
	if((n+1) == A.length){
		return B;
	}
	else{
		B[n/2] = A[n];
		B[A.length/2+1]= A[n+1];
		return reorder(A,n);
	}
	}
	public static ArrayList<Integer> reorder(int[]A, ArrayList<Integer> BB){
		ArrayList<Integer> B = new ArrayList<Integer>();
		if(B.size() == A.length){
			return B;
		}
		else{
			B.set(B.size()/2, A[B.size()]);
			B.set(A.length/2+1, B.size()+1);
			return reorder(A, B);
		}
	}
	
	
	
//	public static int[] reOrder(ArrayList<Integer> A, int n){
//		if(n==0){
//			return A;
//		}
//		else{
//			if(n%2 !0){
//				n++;
//			}
//			A[n/2] = AA.remove(A.);
//			A[n/2+1] = AA.remove(A.length - n);
//		}
//	}
	
	public static ArrayList<Integer> reorder(ArrayList<Integer> AA, int[] A){
		if(AA.size() == A.length){
			return AA;
		}
		else{
		AA.set(AA.size()/2, A[AA.size()]);
		System.out.println(AA);
		AA.set(A.length/2+1, A[AA.size()/2]+1);
		System.out.println(AA);
		return reorder(AA, A);
		}
	}
	public static ArrayList<Integer> toArrayList(int[] array){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i< array.length; i++){
			arrayList.add(i, array[i]);
		}
		return arrayList;
	}
	public static int[] reorder2(ArrayList<Integer> AA, int[] A){
		//System.out.println(AA);
		int n = A.length - AA.size();
		//System.out.println(n);
		if(A.length/2+n/2+1 == A.length){
			return A;
		}
		else{
			A[n/2] = AA.remove(0);
			A[A.length/2+n/2+1] = AA.remove(0);
			return reorder2(AA, A);
		}
	}
	public static void swap(int[] A,int m, int n){
		int temp = A[m];
		A[m] = A[n];
		A[n] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {5,-6,38,2,-6,4,100,29,-6,55,64,-6,44,-6};
//		System.out.println(findMin(array));
//		System.out.println(min_item_count(array));
		int[] array1 = { 0,1,2,3,4,5,6,7,8,9,10};
		
//		for(int i = 0; i< array1.length; i++){
//			System.out.print(reorder(array1,0)[i] + " ");
//		}
//		System.out.println();
		//System.out.println(reorder(new ArrayList<Integer>(), array1));
		ArrayList<Integer> AA = new ArrayList<Integer>();
//		int n = AA.size();
//		System.out.println(n);
//		AA.set(n, 1);
//		n = AA.size();
//		AA.set(n, 2);
//		System.out.println(AA);
		AA = toArrayList(array1);
		ArrayList<Integer> BB = new ArrayList<Integer>();
		BB = toArrayList(reorder2(AA, array1));
//		for(int i = 0; i< array1.length; i++){
//			System.out.print(reorder2(AA,array1)[i] + " ");
//		}
//		System.out.println();
		System.out.println(BB);

	}

}
