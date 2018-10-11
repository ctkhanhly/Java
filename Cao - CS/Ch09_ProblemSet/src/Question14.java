
public class Question14 {
private static double positiveMax(double[][] m){
	double maxNumber = 0;
	double lastMax = 0;
	for (int r=0; r< m.length; r++){
		for(int c=0; c+1< m[0].length; c++){
			maxNumber = Math.max(m[r][c], m[r][c+1]);
			//System.out.print(maxNumber + " ");
			lastMax = Math.max(lastMax, maxNumber);
			//maxNumber = Math.max(lastMax, maxNumber);
			//System.out.print(maxNumber + " ");
			
			
			//if(value> max)
			//max = value;
		}
		System.out.println();
//		if(r<m.length-1)
//		lastMax = maxNumber;
		maxNumber = Math.max(lastMax, maxNumber);
		System.out.print(maxNumber + " ");
	}
	if (maxNumber>0)
		return maxNumber;
	else
		return 0;
}
public static double[][] Array (int rows, int columns, int leftBound, int rightBound){
	double[][] Array = new double[rows][columns];
	for(int r = 0; r< Array.length; r++){
		for(int c =0; c< Array[0].length; c++){
			 Array[r][c] =  (double)(int)(Math.random()*(rightBound-leftBound) ) +leftBound;
			//System.out.printf("%.0f, value");
			
		}
	}
	 return Array;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print(Math.max(3, 5));
//		int m =4;
//		int b = 6;
//		m= Math.max(m, b);
//		System.out.println(m);
		double[][] random = Array(5,4,1,17);
		for(double[] a : random){
			for(double i :a){
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		System.out.print(positiveMax(random));
	}

}
