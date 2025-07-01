class FactorialThread extends Thread{
    private int num;
    public FactorialThread(int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println("the new thread is start");
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("the result is " + result + " for " + num);
        System.out.println("the new Thread is end");
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("the main thread is start");
        FactorialThread t1 = new FactorialThread(10);
        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e){

        }
        System.out.println("the main thread is end");
    }


}




