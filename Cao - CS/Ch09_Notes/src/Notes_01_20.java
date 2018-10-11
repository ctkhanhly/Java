
public class Notes_01_20 {
public static double[][] Array (int rows, int columns, int leftBound, int rightBound){
	double[][] Array = new double[rows][columns];
	for(int r=0; r< Array.length; r++){
		for(int c =0; c< Array[0].length; c++){
			 Array[r][c] = (double)(int) (Math.random()*(rightBound-leftBound)) +leftBound;
			//System.out.printf("%.0f, value");
			
		}
	}
	 return Array;
}
public static void print2Array(double[][] a){
	for(int r=0; r< a.length; r++){
		for(int c =0; c< a[0].length; c++){
			//System.out.printf("%.0f",a[r][c]);	//%.0f to print decimals
			System.out.print(a[r][c]);
			}
		System.out.println();
	}
			
}
//16
public static boolean covers(double[][] m1, double[][] m2){
	int counter = 0;
	if (m1.length != m2.length || m1[0].length != m2[0].length)
		return false;
	else{
		for(int r=0; r< m1.length; r++){
			for(int c =0; c< m1[0].length; c++){
				if(m1[r][c] > m2[r][c])
					counter++;
			}
		}
		System.out.println(counter);
	return 2*counter >= m1.length*m1[0].length;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print2Array(Array(3,5,1,9));
		print2Array(Array(3,5,1,9));
		print2Array(Array(3,10,1,9));
		
		int[] z = {1,2,34,63,34,6,8,98,1234,23,5};
		for(int i:z){//for each element of z //every element is stored in i
			System.out.print(i + " ");//cannot change these values
			i+= 2; // every element still stays the same, not changing z
			//pointer, accessing same object
		}
		double[][] x = Array(3,5,1,9);
		for(double[] a :x){//row
			for(double i :a)//column
				System.out.print(i + "\t");
			System.out.println();
	}
	}

}
