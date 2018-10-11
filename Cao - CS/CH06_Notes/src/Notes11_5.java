
public class Notes11_5 {
	//public static int x=10; //everything can get access
	public static void main(String[] args){
		int x = 10;
		if (x>5){
			int y = 3;//declare here, only used within if statement
			x = x+y;
		}
		//System.out.println(y);//y is not defined here, cannot find y
		x = 3;
		System.out.println(x);//3 not 10
	}
//	public static void PrintX(){
//		int x = 10;//only available in this method
//	}
}

