
public class Question20 {
public static int[][] pascalTriangle(int n){
	int[][] pascal = new int[n+1][];
	pascal[0]= new int[1];
	pascal[1] = new int[2];
	pascal[0][0]=1;
	pascal[1][0]=1;
	pascal[1][1]=1;
for(int r = 2; r <= n; r++){
	pascal[r] = new int[r+1];
	for(int c = 1; c <= r-1; c++){
		//if code line 11 in here, it creates every column.
//		pascal[r][0]=1;
//		pascal[r][pascal[r].length-1]=1;
		pascal[r][c]= pascal[r-1][c-1]+ pascal[r-1][c];
	}
	pascal[r][0]=1;
	pascal[r][pascal[r].length-1]=1;
	
}
return pascal;
}
public static void printPascal(int[][] pascal){
	for(int r = 0; r< pascal.length; r++){
	for(int c = pascal.length-2 -r; c>= 0; c--){
		System.out.print(" ");
	}
	int[] row = pascal[r];//******
		for(int c:row){
			System.out.print(c + " ");
		}
	System.out.println();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPascal(pascalTriangle(5));
	}

}
