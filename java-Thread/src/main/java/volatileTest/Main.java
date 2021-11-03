
package volatileTest;

public class Main {
    public static volatile int a =3;
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("Thread1");
            a = 4;
        });
        Thread thread2 = new Thread(()->{
            System.out.println("Thread2 " + a);
        });
        thread1.start();
        thread2.start();
    }

}
