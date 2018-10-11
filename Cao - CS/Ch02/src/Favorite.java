import java.util.Scanner;

public class Favorite
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    
    System.out.print("What is your favorite movie? ");
    String favorite = kboard.nextLine();
    
    System.out.println("I think " + favorite + " is a terrible movie!") ;
    System.out.println("Just kidding! I like " + favorite + ", too.");
}
}
