package print100;

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // only one object of MyThread();
        Thread t1 = new Thread(t, "fyd-Thread1");
        Thread t2 = new Thread(t, "fyd-Thread2");

        t1.start();
        t2.start();
    }
}


