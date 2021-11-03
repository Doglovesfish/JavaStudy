package runstartTest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThread());
        t.start();
        System.out.println("Main Thread begin");
    }
}

class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("new Thread begin");
    }
}
