
public class Question18 {
public static int arraySum(int[] array){
	int sum = 0;
	for (int i:array){//=0; i< scores.length; i++){
			//sum+= scores[i];
		sum+=i;
	}
	return sum;
}
public static int[] arraySum2D(int[][] array){
	int sum = 0;
	int[] sumArray = new int[array.length];
	for(int i = 0; i< sumArray.length; i++){
			sumArray[i]= arraySum(array[i]);	
	}
	return sumArray;
}
public static int[][] Array (int rows, int columns, int leftBound, int rightBound){
	int[][] Array = new int[rows][columns];
	for(int r = 0; r< Array.length; r++){
		for(int c =0; c< Array[0].length; c++){
			 Array[r][c] =  (int)(Math.random()*(rightBound-leftBound) ) +leftBound;
			//System.out.printf("%.0f, value");
			
		}
	}
	 return Array;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3,4,5};
		System.out.println(arraySum(array1));
int[][] random = Array(4,5,1,9);
for(int[] r :random){
	for(int c:r){
		System.out.print(c + " ");
	}
	System.out.println();
}
for(int i= 0;i< arraySum2D(random).length; i++ ){
	System.out.print(arraySum2D(random)[i] + " ");
}
	}

}
