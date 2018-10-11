public class Question22
{

	public static void main(String[] args)
  {
		int sum=0;
		int total=0;
		boolean previousIs7= false;
		boolean previousIs9 = false;
		for(int k=1; k<1000000; k++){
			for(int m=k; m>0; m/=10){ //&& !((previousIs7 && sum==9)||(previousIs9 && sum==7))
				sum=m%10;
				if(sum==9)
					previousIs9=true;
				else if (sum==7)
					previousIs7=true;
				if(previousIs7 && previousIs9){//if else if and last one is sum=9, never run this.
					total++;
					m=0;
				}
//				else{ //9-8=>false miss 9
//					previousIs7=false;
//					previousIs9=false;
//				}
			}
			previousIs7=false;
			previousIs9=false;
		}
		
		System.out.println(total);
  }
	
}