import java.util.Scanner;

public class LunchTime 
{
  public static int minutesUntilLunch(int hours, int minutes)
  {
	  return (int)((13 - hours - (double)minutes/60)*60 + 0.5);//780 - hour*60 - minutes
  //(13-hour)*60 - minutes
  }
  public static void main(String[] args)
  {
	  Scanner keyboard = new Scanner(System.in);
	  
	  System.out.println("Current time: ");
	  String string = keyboard.nextLine();
	  int i = string.indexOf(":");
	  int hours = Integer.parseInt(string.substring(0, i));
	  int mins = Integer.parseInt(string.substring(i+1));
	  
	  keyboard.close();
	  
	  int minutes = minutesUntilLunch(hours, mins);
	  System.out.println(minutes + " until lunch");
  }
}
