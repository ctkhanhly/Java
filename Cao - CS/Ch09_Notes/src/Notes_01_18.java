
public class Notes_01_18 {
	public static void main(String[] args){
//2D: making array within array like a table
	//1D array: 1 row of a table only
	//declaring 2D arrays - [row][columns]
	int[] [] x = new int[4][5];
	
	//get# of rows vs. get # of columns
	
	System.out.println(x.length);//#row
	
	//#columns 
	System.out.println(x[0].length);
	//access single element
	x[0][0] = 4;
	System.out.println(x[4][0]);//0
	
	//nested for loops access all elements
	//set all elements to 1 or true
	for(int r = 0; r < x.length; r++){
		for(int c = 0 ; c < x[0].length; c++){
			x[r][c] = c;
			System.out.print(x[r][c] + "\t");
	}
	System.out.println();
	}
	//intialize r,c to 1 to get rid of 0s.
	}
}
