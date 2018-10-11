
public abstract class Poem {
	public abstract int numLines();
	public abstract int getSyllables(int k);
	public void printRhythm(){
		for(int m = 1; m <= numLines(); m++){
			for(int n = 1; n <= getSyllables(m); n++){
				if(n == getSyllables(m))
					System.out.print("ta");
				else
				System.out.print("ta-");
			}
			System.out.println();	
		}
	}
	
}
