
public class Max {

	public static int max( int[] a){
		int max= 0;
		for (int i =0; i< a.length-1; i++){
			if( i ==0){
				max = a[i];
			}
			
			if(a[i+1]> max && a[i+1]%10==0){
				
				max = a[i+1];
			}
		}
		if(max<10){
			max = 0;
		}
		return max;
	}
	public static int[] reverseArray( int[] a){
		for( int i= 0; i <a.length; i++){
			int temp = a[a.length-1-i];
			a[a.length-1-i]= a[i];
			a[i] = temp;
		}
		return a;
	}
	public static int[] reverseArray1( int[] b){
		int[] a = new int[b.length];
		for(int i = 0; i<b.length; i++){
			a[i] = b[i];
		}
		for( int i= 0; i <a.length; i++){
			int temp = a[a.length-1-i];
			a[a.length-1-i]= a[i];
			a[i] = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4,10,12,15,100,33,20,150,70};
		System.out.println(max(a));
		int[] b = reverseArray(a);
		System.out.println("List b is");
		
		for( int i:reverseArray(a)){
			System.out.print(i+"\t" );
		}
		System.out.println("\n List a is: ");
		for( int i:a){
			System.out.print(i+"\t" );
		}
		System.out.println();
		for( int i:reverseArray1(a)){
			System.out.print(i+"\t" );
		}
		System.out.println();
		System.out.println("OK!".equalsIgnoreCase("ok!"));

}
}
