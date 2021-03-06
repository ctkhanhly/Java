
public class Testing {
public static int[] findMaxAndMin(int[] scores){
	int max =0;
	int min =0;
	int previousMax;
	int previousMin;
	for(int i = 1; i<scores.length; i++){
		previousMax = max;
		max = Math.max(scores[i], scores[i-1]);
		max = Math.max(max, previousMax);
		
		previousMin = min;
		min = Math.min(scores[i], scores[i-1]);
		min = Math.min(min, previousMin);
	}
	scores[0] = max;
	scores[1] = min;
	return scores;
}

public static void main(String[] args){
	System.out.println(Math.min(2, 3));
	
	int[] scores = {1,3,2,-5,0,10,9,8,7,-2,1,15,3,5,3,2};
	System.out.println(findMaxAndMin(scores)[1] + " " + findMaxAndMin(scores)[0]);
	
	
}
}
