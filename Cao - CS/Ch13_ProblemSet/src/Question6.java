import java.util.ArrayList;

public class Question6 {
	public static void printStars(int n){
	if(n==1)
		System.out.print("*");
	else{
		System.out.print("*");
		printStars(n-1);
	}
	}
	//nevermind this part
//	public static void printTriangle(int n){
//		ArrayList<Integer> index = new ArrayList<Integer>();
//		index.add(1);
//		if(index.size() == n){
//			printStars(n);
//			//System.out.println(index.size());
//		}
//		else{
//			printStars(index.size());
//			System.out.println();
//			index.add(1);
//			printTriangle(n-1);
//			//index.add(1);
//		}
//	}
	//a
	public static void printTriangle(int n){
		
		if (n == 1){
			printStars(1);
			System.out.println();
	 		//System.out.println(index.size());
		}
		else{//if(n>0)
			printTriangle(n-1);
			printStars(n);
			System.out.println();
			//printTriangle(n-1);
		}
	}
	//b
//public static void printTriangle(int n){
//		
//		if (n == 1){
//			printStars(1);
//			System.out.println();
//	 		//System.out.println(index.size());
//		}
//		else{
//			
//			printStars(n);
//			System.out.println();
//			printTriangle(n-1);
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printStars(5);
		printTriangle(4);
		int m = 5;
		int n = m;
		n--;
		//System.out.println(m + " " + n);// 5 4
	}

}
