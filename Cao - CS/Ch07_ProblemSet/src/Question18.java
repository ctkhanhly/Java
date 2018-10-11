import java.util.Scanner;
public class Question18{
	
	public static void main(String[] args){
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Enter the n in xn of the sequence: ");
	int n = kb.nextInt();
	kb.close();
	
//	double x=1;
//	int m =1;
//	for (int k=0; k<=n-1; k++){
//		if(k==0)
//			x=1;
//		else
//		x= 1 + 1/x;	
//	}
//	for(m = 1; x!=(int)x && m <=50; m++ ){
//		x*=m;
//		if (x!=(int)x){
//		x/=m;
//		}
//		//m max =50
//	}
//	 
//		System.out.println(x+"/"+ (m-1));
//	}
	int point =0;
	int numFrac = 1;
	int denoFrac =1;
	for (int k=0; k<=n-1; k++){
		if(k==0){
			numFrac =1;
			denoFrac =1;
		}
		else if (k==1){
		numFrac +=denoFrac;
		point = numFrac;
		}
		else {
			numFrac +=denoFrac;
			denoFrac = point;
			point = numFrac;
		}
	}	
	System.out.println(numFrac +"/"+denoFrac);
	
	
	}	
}
//2h: 25 MC - 1h, 3- FR