
public class Question20 {
	
	public static void printStarTriangle(int n)
	{
		for(int line =1; line<=n;line++){
			for(int space=0; space<n-line; space++){
				System.out.print(" ");
			}
			for(int star=2*line-1; star>=1; star--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStarTriangle(8);
	}

}
