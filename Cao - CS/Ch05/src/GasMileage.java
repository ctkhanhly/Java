// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage//just jumping program, not trying to make any object
{
  public static double gasMileage(int miles, double gallons)// dont make this static- delete static
  //have to create an object in main method to use
  {
    return miles/gallons;
  }
  //or:
  //public static double gallons(double mpg, int miles){
  // return mpg/miles;}
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the gas mileage: ");
    double mpg = input.nextDouble();
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
//    System.out.print("Gallons of gas spent: ");
//    double gallons = input.nextDouble();
    
    input.close();
   
    //w/o static in the above method static double
    //GasMileage g = new GasMileage();
    //double mpg = gasMileage(miles, gallons);
//    System.out.printf("Your car's gas mileage was %.1f miles per gallon\n", mpg);
    double gallons = (double) miles/mpg;
    System.out.println("The amount of gas spent in the trip is:" + gallons);
  }
}
