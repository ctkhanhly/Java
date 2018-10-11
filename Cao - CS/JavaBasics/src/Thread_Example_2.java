
public class Thread_Example_2 {
/*
Threading is a facility
to allow multiple activities to coexist within a single process. 
Like processes, threads are independent, concurrent paths of execution through a program,
and each thread has its own stack, its own program counter, and its own local variables.
However, threads within a process are less insulated from each other than separate processes are. 
They share memory, file handles, and other per-process state.
*/
	//when an application has multiple independent event-driven components
	// where you simulate the interaction between multiple entities.
	// You can even create multiple threads so you can read from multiple sockets at once
	//synchronized and volatile. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//JVM: co nhieu thread thuc hien 1 luc =>
//ko dam bao tuan tu thuc hien cua cac threads.
		Thread55 thread55 = new Thread55();
		Thread thread1 = new Thread(thread55);
		Thread thread2 = new Thread(thread55);
		
		thread1.start();
		thread2.start();
	}

}
class Thread55 implements Runnable{
	public void run(){
		try{
			for(int i = 0; i<50; i++){
				Thread.sleep(50);//longer like 5000milisec=> order of threads still work
				//else: only order of run of each thread works
				//compare sleep(1) and sleep(5000)
				System.out.println(Thread.currentThread().getName());
			}
		}
		catch(InterruptedException e){
			
		}
	}
}
/*
To use the Runnable interface to create and start a thread, you have to do the following:
Create a class that implements Runnable.
Provide a run method in the Runnable class.
Create an instance of the Thread class and pass your Runnable object to its constructor as a parameter. ...
Call the Thread object's start method.
*/
