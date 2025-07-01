class RunnableThread implements Runnable {
   private int sleepTime;
   public RunnableThread() {
       sleepTime = (int)(6000*Math.random());
   }
   public void run(){
       System.out.println(Thread.currentThread().getName() + " is running");
       System.out.println(Thread.currentThread().getName() + " is sleeping for " + sleepTime + " milliseconds");
       try {
           Thread.sleep(sleepTime);
           System.out.println(Thread.currentThread().getName() + " is done");
       }
       catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}


public class TestRunnable {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");
        RunnableThread t1 = new RunnableThread();
        RunnableThread t2 = new RunnableThread();
        RunnableThread t3 = new RunnableThread();
        Thread thread1 = new Thread(t1, "Thread 1");
        Thread thread2 = new Thread(t2, "Thread 2");
        Thread thread3 = new Thread(t3, "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
