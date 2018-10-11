
public class Question24 {
public static void rotateLeft(int[] a){
	int m = a[0];
	for(int i = 0; i<a.length-1; i++){
		a[i] = a[i+1];
	}
	a[a.length-1] = m;
}
public static void rotateRight(int[] a){
	int m = a[a.length-1];
	for(int i = a.length-1; i>0; i--){
		a[i] = a[i-1];
	}
	a[0] = m;
}
public static void rotate(int[] a, int d){
	for(int i = 0; i<d; i++)
		rotateLeft(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,3,4,5,6,7};
for(int i :a)
	System.out.print(i + " ");
//rotateLeft(a);
//for(int i :a)
//	System.out.print(i + " ");
System.out.println();
rotate(a, 9);
for(int i :a)
	System.out.print(i + " ");
	}

}
