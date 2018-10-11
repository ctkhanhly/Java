
public class Question1 {
public static int product(int a, int b){
	if(a==1)
		return b;
	else
		return product(a-1, b) + b;
}
public static void main(String[] args){
	
	System.out.println(product(2,3));
}
}
