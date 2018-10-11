//quadratic formula
public class Notes_11_29 {
	public static void main(String[] args){
		int a =1; 
		int b = -3;
		int c=5;
		
		double d = Math.pow(b*b-a*a*c, 0.5);
		double r1 = 0;
		double r2 = 0;
		
		if(d>0){
			r1 = (b+d)/(2*a);
			r2 = (-b -d)/(2*a);
			
			System.out.println(r1 + ", "+ r2);
		}
		else if(d==0){
			r1 = (-b/ (2*a));
			r2 = r1;
			
			System.out.println(r1 + ", "+ r2);
		}
		else
			System.out.println("Imaginary Roots");
	}

}
