
public class Question10 {

	public static boolean isPrimeA(int n)
	{
		 if (n <= 1)
		      return false;

		    int m = 2;
//		    if (n==2)
//		    return true;
//		    else 
//		    	m++;
			    if (n==2)
			    	return true;
			    else if (n%2==0)
			    	return false;
			 while (m * m <= n)
			    {
			 if (m%2==0)
				 m++;
			 else if (n % m == 0)
			        return false;
			 	else
			 		m++; 
			    }

			    return true;
	}
	
	public static boolean isPrimeB(int n)
	{
		 if (n <= 1)
		      return false;

		    int m = 2;
		    if (n==2)
		    	return true;
		    else if (n%2==0)
		    	return false;
		    while (m * m <= n)
		    {
		 if (m%2==0)
			 m++;
		 else if (n % m == 0|| n%2==0 ||n%3==0)
		        return false;
		 else
			 m++;
		    }

		    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeA(8));
		System.out.println(isPrimeB(21));
	}

}
