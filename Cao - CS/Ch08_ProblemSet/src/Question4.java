import java.text.DecimalFormat;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String dateStr = "05/31/2019";
//a
dateStr = dateStr.substring(3, 5) + "-" + dateStr.substring(0, 2) + "-"+ dateStr.substring(6);
//b
int n = dateStr.indexOf('/');
int m = dateStr.lastIndexOf('/');
dateStr = dateStr.substring(n+1, m) + "-" + dateStr.substring(0, n) + "-"+ dateStr.substring(6);
System.out.print(dateStr);
//c??? what should I do
//I tested all right in main method of each question.












//DecimalFormat date = new DecimalFormat("00-00-0000");
//dateStr = date.format(dateStr);
//System.out.print(dateStr);
//does not work, i dont understand why

	}

}
