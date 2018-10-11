import java.awt.Robot;
import java.io.IOException;

public class Program {

	private Robot robot;
	private Runtime runtime;
	
	public void drawSine(){
		
	
	runtime = Runtime.getRuntime();
	
	try {
		runtime.exec("mspaint.exe");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//built-in method, not need full path
	//runtime.exec("/Applications/Google\ Chrome.app");
	
	//delay b/c our robot doesnt see if mspaint is open or not
	}
}
