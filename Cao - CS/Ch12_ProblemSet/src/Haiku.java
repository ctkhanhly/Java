
public class Haiku extends Poem{

	public int numLines(){
		return 3;
	}
	public int getSyllables(int k){
		if (k==1)
			return 5;
		else if(k==2)
			return 7;
		else //if(k==3)
			return 5;
//		else
//			throw new IllegalArgumentException("Haiku poem only has 3 lines!!");
	}
	public void printRhythm(){
		super.printRhythm();
	}
}
