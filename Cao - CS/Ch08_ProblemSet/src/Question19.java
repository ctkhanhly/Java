import java.util.Scanner;
public class Question19 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int like = 0;
		 boolean doesCooneyLike = false;
		 int m = 0;
		while(like<5){
			if(m==0)
			System.out.println("Try a word: ");
			else
				System.out.println("Try another word: ");	
			
	    	String guess = input.nextLine();
	    	
	    	doesCooneyLike = false;
		    for (int n=1; n< guess.length(); n++){
		    	if (guess.charAt(n)== guess.charAt(n-1)){
		    		System.out.println("Yes Cooney likes " + guess);
		    		doesCooneyLike = true;
		    	 }
		    }
		    if (doesCooneyLike)
			like++;
		    if (!doesCooneyLike){
		    	System.out.println("No, Cooney doesn't like " + guess);
		    	like = 0;
		    }
		    if(like==5)
		    System.out.println("You have guessed 5 correct words in a row! You won! It's getting fun? Run again if you want to play another round!");
		    m++;
		     
		}
	}

}
