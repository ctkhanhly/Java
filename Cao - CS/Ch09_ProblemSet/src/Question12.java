
public class Question12 {
public static int computeScore(String word){
	int total = 0;
	int[] SCRAPPLEno= {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	String SCRAPPLElet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	for(int i=0; i<word.length(); i++){
		total += SCRAPPLEno[SCRAPPLElet.indexOf(word.charAt(i))];
	}
	return total;
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(computeScore("AEN"));
	}

}
