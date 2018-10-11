public class Question19{
	public static void main(String[] args){
		int row;
		int columm=0;
		for(row=0; row<=12; row++){
			for(columm=0; columm<=12; columm++){
				if(row==0)
					System.out.print(columm + "\t");
				else if (columm==0)
					System.out.print(row + "\t");
				else
				System.out.print(columm*row +"\t");
			}
			System.out.println();
		}
	}
}