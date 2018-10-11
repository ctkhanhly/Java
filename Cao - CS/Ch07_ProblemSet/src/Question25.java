public class Question25{
	
	public static void makeChange(int amt){
		//quarter, d, nickel, p
//		int q=0;
//		int d =0;
//		int n =0;
//		int p =0;
//		int sum=0;
//		for(q=0; sum!=amt; q++){
//			sum=q*25;
//			for(d=0; sum!=amt; d++){
//				sum+=d*10;
//				for(n=0; sum!=amt; n++){
//					sum+=n*5;
//					for(p=0;sum!=amt; p++){
//						sum+=p;
//						System.out.println("amt cents = "+ q +" quarters + "+ d+" dimes + "+n +" nickels + " +p+" pennies");
//					}
//				}
//			}
//		}
//	}
	//my sum is increasing, cannot use like this!
	
	
		for(int q=0; q*25!=amt; q++){
			for(int d=0; q*25+10*d!=amt; d++){
				for(int n=0; q*25+10*d+5*n !=amt; n++){
					int p= amt- (q*25+10*d+5*n);
						System.out.println("amt cents = "+ q +" quarters + "+ d+" dimes + "+n +" nickels + " +p+" pennies");
				}
			}
		}
	}
	public static void main(String[] args){
	makeChange(70);	
		
	}
	
	
	
	
	
}