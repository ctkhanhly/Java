
public class Question9 {
//	public static void swap(int[] a){
//		int b = a[0];
//		a[0] = a[a.length-1];
//		a[a.length-1] = b;
//		
//	}
	public static void swap(int m, int n){
		int b = m;
		m = n;
		n = b;
	}
	public static int[] makePythagoreanTripple(int m, int n){
		if (m<n)
			swap(m,n);
		int a = m*m - n*n;
		int b = 2*m*n;
		int c = m*m + n*n;
		if(a>b)
			swap(a,b);
		int[] x ={a,b,c};
		return x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(makePythagoreanTripple(1,2)[0] + " "+ makePythagoreanTripple(1,2)[1] + " "+ makePythagoreanTripple(1,2)[2]);
int a = 1;
int b = 2;
swap(a,b);
System.out.println(a);
	}

}
