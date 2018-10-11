
public class Question4 {
public static int findMin(int[] list, int n){
	int index = 0;
	if(n>2){
		return Math.min(findMin(list,n-1), list[n-1]);
	}
	else
		return Math.min(list[0],list[1]);
}
public static void main(String[] args){
	int[] list = {8,6,8,2,4,3,5,9};
	System.out.println(findMin(list,5));
}
}
