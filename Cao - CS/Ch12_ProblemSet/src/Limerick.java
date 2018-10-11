
public class Limerick extends Poem{
	public int numLines(){
		return 5;
	}
	public int getSyllables(int k){
		if (k==1 || k==2 ||k==5)
			return 9;
		else //if(k==3||k==4)
			return 6;
//		else
//			throw new IllegalArgumentException("Limerick poem only has 5 lines!!");
	}
	public void printRhythm(){
		super.printRhythm();
	}
}
