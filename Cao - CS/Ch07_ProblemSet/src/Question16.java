
public class Question16 {
public static int funNumber(int n, int b){
	for (int p =1; p<=n; n-=p){
		p *=b;
	}
	return n;
}
	public static void main(String[] args) {
	System.out.println(funNumber(37,2));//7 should be 6?

	}

}
