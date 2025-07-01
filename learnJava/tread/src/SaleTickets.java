class TicketsTask implements Runnable {
    //剩余票数
    private int ticketsNum;
    //票名
    private final String ticketsName;
    //锁对象
    private final Object lock = new Object();
    boolean haveTickets = true;
    public TicketsTask (int ticketsNum, String ticketsName) {
        this.ticketsNum = ticketsNum;
        this.ticketsName = ticketsName;
    }
    @Override
    public void run() {
        while (true) {
            //对象里面有一个锁，只有取得这个锁的线程才能进入这个代码块
            synchronized (lock) {
                if (ticketsNum <= 0) {
                    if(haveTickets) {
                        haveTickets = false;
                        System.out.println(ticketsName + "已经售罄");
                    }
                    break;
                }
                ticketsNum--;
                System.out.println(Thread.currentThread().getName() + "卖出了一张" + ticketsName+ "，剩余票数： " + ticketsNum);

            }
            try {
                Thread.sleep((int)(1000*Math.random()));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}


public class SaleTickets {
    public static void main(String[] args) {
        TicketsTask t1 = new TicketsTask(10, "A票");
        TicketsTask t2 = new TicketsTask(10, "B票");
        TicketsTask t3 = new TicketsTask(10, "C票");
        Thread thread11 = new Thread(t1, "A票窗口1");
        Thread thread12 = new Thread(t1, "A票窗口2");
        Thread thread13 = new Thread(t1, "A票窗口3");
        Thread thread21 = new Thread(t2, "B票窗口1");
        Thread thread22 = new Thread(t2, "B票窗口2");
        Thread thread23 = new Thread(t2, "B票窗口3");
        Thread thread31 = new Thread(t3, "C票窗口1");
        Thread thread32 = new Thread(t3, "C票窗口2");
        Thread thread33 = new Thread(t3, "C票窗口3");
        thread11.start();
        thread12.start();
        thread13.start();
        thread21.start();
        thread22.start();
        thread23.start();
        thread31.start();
        thread32.start();
        thread33.start();

    }
}
