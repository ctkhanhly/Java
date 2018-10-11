
public class Question26 {
	
	 public static int gcf(int a, int b)
	   {
	while (a!=b) {
	       int temp = Math.min(a,b);
	       a = Math.max(a, b)- temp;
	       b = temp;
	}
	
	return b; }

	public static void main(String[] args) {
		System.out.println(gcf(18,32));

	}

}
