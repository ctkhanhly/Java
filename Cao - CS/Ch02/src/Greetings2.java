/**
 * This program prompts the user to enter his or her
 * first name and last name and displays a greeting message.
 * Author: Maria Litvin
 */

import java.util.Scanner;

public class Greetings2
{
  public String toString()
  {
    // TODO Auto-generated method stub
    return super.toString();
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = kboard.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = kboard.nextLine();
    
    System.out.print("Enter your age: ");
    int age = kboard.nextInt();

    System.out.println("Hello, " + firstName + " " + lastName + " " + (age-10)) ;
    System.out.println(" In " + (25-age) + " years you can rent a car!");

    kboard.close();
  }
}
