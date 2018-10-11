
public class Question10 {
	public static int[] createWedge(int a){
		int[] m = new int[2*a-1];
		int b = a-1;
		for(int i = 0; i< m.length; i++){
			if (i>=a){
				m[i]= b;
				b--;
			}
			else
			 m[i] = i+1;
		}
		return m;
	}
//	int[] m = new int[2*a-1];
//	int b = a-1;
//	for(int i = 0; i< m.length; i++){
//		for(int y = 1; y>=1; y--){
//	  		m[i]
//	  				= y;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = createWedge(15);
		for(int i =0; i<x.length; i++)
System.out.print(x[i] + " ");

	}

}
