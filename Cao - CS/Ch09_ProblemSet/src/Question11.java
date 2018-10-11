
public class Question11 {
public static int[] Fibonacci(int n){
	int [] x = new int[n];
	x[0]=0;
	x[1]=1;
	for(int i=2; i<x.length; i++){
		x[i] = x[i-1] + x[i-2];
	}
	return x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Fibonacci(10)[2]);
System.out.println(Fibonacci(10)[3]);
System.out.println(Fibonacci(10)[4]);
System.out.println(Fibonacci(10)[5]);
System.out.println(Fibonacci(10)[6]);
System.out.println(Fibonacci(10)[7]);
System.out.println(Fibonacci(10)[8]);
System.out.println(Fibonacci(10)[9]);


	}

}
