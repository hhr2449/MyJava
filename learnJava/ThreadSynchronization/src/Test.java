/* synchronized关键字：用于修饰代码块，被修饰的代码块被称为同步语句块
   同一时间，同一个对象中的同步语句块只能有一个线程在执行
   wait():当前进程停止运行，并且释放对象锁，进入等待队列，等待被唤醒
   notify():唤醒等待队列中的某个进程
*/
/*
    设计思路：设计一个buffer类，用于表示产品的缓冲区，里面维护一个队列，队列中存放产品
    （可以将一个buffer类对象看成一个仓库，线程就是负责装货和取货的工人，
    同一时间只能有一个工人有钥匙进入，如果这个工人无法取货/装货，则把钥匙给另一个工人）
    提供生产方法和消费方法，这两个方法都是同步方法，从而保证同一个缓冲区对象只能有一个线程进行操作
    生产方法中：1.判断当前缓冲区是否已满，如果已满则让当前线程等待，
    这时候对象锁会释放，消费线程获取对象锁，开始取出产品，取出产品后消费线程会唤醒生产线程
    2.如果缓冲区未满，则将产品放入缓冲区，并通知消费线程可以开始消费
    消费方法也类似
 */

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> queue;
    private final int MAX_SIZE;
    Buffer(int size) {
        MAX_SIZE = size;
        queue = new LinkedList<>();
    }
    public synchronized void produce(int value) {
        while (queue.size() >= MAX_SIZE) {
            System.out.println("缓冲区已满，请等待消费");
            try{
                wait();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(value);
        notify();
        System.out.println("生产者生产了：" + value);


    }
    public synchronized void consume() {
        while (queue.isEmpty()) {
            System.out.println("缓冲区为空，等待生产");
            try {
                wait();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int value = queue.poll();
        notify();
        System.out.println("消费者消费了：" + value);
    }
}
class producer implements Runnable {
    private Buffer buffer;
    public producer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < 20; i++) {
                buffer.produce(i);
                Thread.sleep((int)(1000*Math.random()));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
class consumer implements Runnable {
    private Buffer buffer;
    public consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < 20; i++) {
                buffer.consume();
                Thread.sleep((int)(1000*Math.random()));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);
        Runnable produce = new producer(buffer);
        Runnable consume = new consumer(buffer);
        Thread t1 = new Thread(produce, "Producer");
        Thread t2 = new Thread(consume, "Consumer");
        t1.start();
        t2.start();
    }


}
