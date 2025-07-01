class TestThread extends Thread{
    private int sleepTime;
    public TestThread (String name) {
        super(name);
        sleepTime = (int)(Math.random()*6000);
    }
    @Override
    public void run() {
        System.out.println(getName() + " is running");
        try {
            System.out.println(getName() + " is sleeping for " + sleepTime + " milliseconds");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + " is done");
    }
}




public class TestSleep {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");
        TestThread t1 = new TestThread("Thread 1");
        TestThread t2 = new TestThread("Thread 2");
        TestThread t3 = new TestThread("Thread 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The main thread is ending");
    }
}
