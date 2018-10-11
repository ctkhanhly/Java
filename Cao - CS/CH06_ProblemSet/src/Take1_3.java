// Chapter 6 Question 21

import java.util.Scanner;

public class Take1_3
{
  private static Scanner kboard;

  private int stonesLeft;

  public Take1_3(int n)
  {
    stonesLeft = n;
  }
//winning strategy: can either go first or second, pick a number of stone so that the total of stones taken of two players correspond to mod4 of nStones 
 //the last 4 stones: he pick either 1,2,3, I pick the last
  /*
   * Returns the correct number of stones to take
   * (according to the winning strategy) when nStones
   * remain in the pile; if such a move is not possible,
   * returns a random number of stones to take.
   * Precondition: nStones > 0
   */
  public int computerMove(int nStones)
  {
	  int n = nStones%4;
	  if (n==0)
	   {
		  n=3;
//		  if (n > nStones) //dont really need, bc n==0 -> nStones min = 4
//			  n = nStones;
		   n = (int)(n*Math.random()+1);
	   }
		  //n = (int)(nStones*Math.random()+1);
	  return n;
  }

  /*
   * Prompts the user to take a number of stones;
   * If the move is valid, returns the number of stones
   * taken; otherwise, displays an error message --
   * "You are allowed to only take 1, 2, or 3 stones" or
   * "Can't take that many: only <nStones> left in the pile"
   * -- and returns -1:
   * Precondition: nStones > 0
   */
  public int humanMove(int nStones)
  {
    System.out.print("How many stones do you take? ");
    int n = kboard.nextInt();
    if (n==3 || n==2 || n==1)
    	return n;
    else if ((n!=3 || n!=2 || n!=1) && n < nStones)
    {
    	System.out.println("You are allowed to only take 1, 2, or 3 stones");
    	return -1;
    }
    else
    {
    	System.out.println("Can't take that many: only"+ nStones + "ledt in the pile");
    	return -1;
    }
    
  }

  /**
   * Plays the game
   */
  public void play()
  {
    while (stonesLeft > 0)
    {
      System.out.println(stonesLeft + " stone(s) left in the pile");

      int n = -1;
      while (n < 0)
        n = humanMove(stonesLeft);
      stonesLeft -= n;
      System.out.println("You took " + n + " stone(s)");
      if (stonesLeft == 0)
      {
        System.out.println("Congrats -- you won!");
      }
      else
      {
        n = computerMove(stonesLeft);
        stonesLeft -= n;
        System.out.println("I take " + n + " stone(s)");
        if (stonesLeft == 0)
          System.out.println("Hooray -- I won!");
      }
    }
  }

  /****************************************************************/

  public static void main(String[] args)
  {
    kboard = new Scanner(System.in);

    int n = 8 + (int)(4 * Math.random());
    Take1_3 game = new Take1_3(n);
    game.play();

    kboard.close();
  }
}
