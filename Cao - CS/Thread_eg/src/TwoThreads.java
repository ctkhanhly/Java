public class TwoThreads {
 
    public static class Thread1 extends Thread {
        public void run() {
            System.out.println("A");
            System.out.println("B");
        }
    }
 
    public static class Thread2 extends Thread {
        public void run() {
            System.out.println("1");
            System.out.println("2");
        }
    }
 
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
//We have no idea in what order the lines will execute, 
//except that "1" will be printed before "2" and "A" before "B."
//The output could be any one of the following:

//Not only may the results vary from machine to machine, 
//but running the same program multiple times on the same machine may produce different results. 
//Never assume one thread will do something before another thread does, 
//unless you've used synchronization to force a specific ordering of execution.

//Thread.join(), 
//The Thread API contains a method for waiting for another thread to complete: the join() method. 
//When you call Thread.join(), 
//the calling thread will block until the target thread completes.

//Except when using Thread.join() and Object.wait(), 
//the timing of thread scheduling and execution is nondeterministic.

//sleep
//Thread.interrupt()
//If a thread is interrupted by a call to Thread.interrupt(),
//the sleeping thread will throw an InterruptedException so that
//the thread will know that it was awakened by an interrupt and 
//won't have to check to see if the timer expired.

//The Thread.yield() method is like Thread.sleep(), 
//but instead of sleeping, it simply pauses the current thread momentarily 
//so that other threads can run. In most implementations, 
//threads with lower priority will not run when a thread of higher priority calls
//Thread.yield().






