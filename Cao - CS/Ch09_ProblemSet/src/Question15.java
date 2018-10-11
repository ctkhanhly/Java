
public class Question15 {
public static void fillCheckerboard(String[][] checkBoard){
for (int r= 0; r< checkBoard.length; r++){
	for(int c=0; c< checkBoard[0].length; c++){
		if((r+c)%2 ==0)
			checkBoard[r][c] = ".";
		else
			checkBoard[r][c] = "x";
		System.out.print(checkBoard[r][c]+"\t");
	}
	System.out.println();
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] haha = new String[10][12];
fillCheckerboard(haha);
	}

}
