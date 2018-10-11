
public class Quesstion14 {
	public static void sort(double[] a){
		for(int n = a.length-2; n>=0; n--){
			
			double aTemp = a[n];
			int i = n;
			while(i<a.length-1 && aTemp> a[i+1])
			{
				a[i] = a[i+1];
				i++;
			}
			a[i] = aTemp;
		}
	}
//	public static void sort(double[] a){
//		for(int n = 0; n<a.length; n++){
//			
//			double aTemp = a[n];
//			int i = n;
//			while(i>0 && aTemp<a[i-1] )
//			{
//				a[i] = a[i-1];
//				i--;
//			}
//			a[i] = aTemp;
//		}
//	}
	public static void print(double[] list){
		for(double i :list)
			System.out.print(i + ", ");
		System.out.println();
	}
	public static void main(String[] args){
		double[] list = {3.0,2.0,5.0,1.0,4.0,6.0,7.0};
		sort(list);
		print(list);
	}
}
