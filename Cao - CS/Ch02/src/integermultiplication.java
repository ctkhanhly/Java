import java.util.Scanner;

public class integermultiplication
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    double n = keyboard.nextDouble();
    System.out.println(n + " / 2 = "+ (n/2));
    
    keyboard.close();
    
  }
  

}
