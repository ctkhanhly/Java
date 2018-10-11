
public class Question17 {
public static double average(int[] scores){
int sum = 0;
	for (int i:scores){//=0; i< scores.length; i++){
			//sum+= scores[i];
		sum+=i;
 }
	return (double) sum/scores.length;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] scores = {85,88,70,90,96,91};
System.out.println(average(scores));
	}

}
