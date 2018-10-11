
public class Thread_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread thread = new Thread();//thuoc Java lang -> ko can import
		//cho phep implement 1 method ben trong
		Thread thread = new Thread(){
			public void run(){
				try{
				System.out.println("Pause");
				Thread.sleep(3000);
				System.out.println("Restart");
				}
				catch( InterruptedException e){
					
				}
			}
		};
		thread.start();//bth dtart cung goi run/ cac method o trong
		//neu run empty -> ko lam gi
		//muon start thread- o day
		//chi dc goi 1 lan- IllegalStartExcepion(2 lan)
		//thread.run() -o day cung lam nhu thread.start()
		//thread.run() - goi dc nhieu lan
		
		MyThread mt = new MyThread();
		mt.start();
	}
}
class MyThread extends Thread{//xay dung tien trinh rieng
	public void run(){
		for(int i = 0; i<10; i++){
			try{
				System.out.println("Pause" + i);
				Thread.sleep(500);
				System.out.println("Restart" + i);
			}
			catch( InterruptedException e){
			
		}
		}
	};
	
}
class YourThread implements Runnable{//same function as Thread
	//for classes that already extends some other class
	public void run(){
	}
	
	
}
//daemon threads
//We mentioned that a Java program exits when all of its threads have completed, 
//but this is not exactly correct. What about the hidden system threads,
//such as the garbage collection thread and others created by the JVM?
//		These system threads are called daemon threads. 
//A Java program actually exits when all its non-daemon threads have completed.



	

