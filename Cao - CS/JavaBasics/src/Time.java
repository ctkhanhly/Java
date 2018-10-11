import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get time by millis
		long start = System.currentTimeMillis();
//the difference, measured in milliseconds, between the current time and midnight
		//, January 1, 1970 UTC. - long
		
		try{
		for(int i = 0; i<1000; i++){
			Thread.sleep(2);//chuong trinh tam dung bao nhieu milliseconds.
			}
		}
		catch( Exception e){
			
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("Milli: " + (end-start));//~2017 => + time for loop and try catch?
		
		//Get time by nano
		
		start = System.nanoTime();//long
		end = System.nanoTime();
		System.out.println("Nano: " + (end-start));//2 lenh cach nhau => rat nho
		//rat chinh xac
		//du lieu be
		
		//Display the system time
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String day = dateFormat.format(date);
		System.out.println(day);
	}
	// package: classes in the package relate to each other.

}
