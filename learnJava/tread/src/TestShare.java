class RunnableThread2 implements Runnable {
    private int sleepTime;
    public RunnableThread2() {
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


public class TestShare {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");
        RunnableThread2 r1 = new RunnableThread2();
        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r1, "Thread 2");
        Thread t3 = new Thread(r1, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The main thread is ending");
    }
}
