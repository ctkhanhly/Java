
public class TestCharMatrix extends CharMatrix{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharMatrix haha = new CharMatrix(5,4);
		for(int r= 0; r < 5; r++){
			for(int c = 0; c<4; c++){
				System.out.print(haha[r][c]);
			}
				System.out.println();
		}
	}

}
