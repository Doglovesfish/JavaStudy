package print100;

public class MyThread implements Runnable {
    public int a = 0;

    @Override
    public void run() {
        while (a < 100) {
            synchronized (this) {
                notify();
                System.out.println(Thread.currentThread().getName() + " " + a);
                a++;
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(a==100)
                    notify();
            }
        }
    }
}
