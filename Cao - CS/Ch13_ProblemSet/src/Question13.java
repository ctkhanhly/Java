
public class Question13 {
//019
	public static void display(int x){
		if(x>=10){
			display(x/10);
			System.out.print(x%10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
display(2019);
	}

}
