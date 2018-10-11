
public class Question23 {
//public static boolean isMedian(double[] sample, double m){
//	if (sample.length%2==0)
//		return m == (sample[(sample.length-2)/2+1] + sample[(sample.length-2)/2])/2;
//	else
//		return m == sample[(sample.length-1)/2];
//}
	public static boolean isMedian(double[] sample, double m){
		int a= 0;
		//if(sample.length%2!=0){
		for(double i: sample){
			if(i>m)//I dont think this method works because what if median has same values as 
				a++;//one or two numbers nearby
		}
		return a==(sample.length-1)/2;	
		//}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] random ={88,89,90,91,92,99};
System.out.print(isMedian(random,91.5));
	}

}
