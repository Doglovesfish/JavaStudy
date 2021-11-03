package com.yide.n4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test1 extends Thread{

    static int counter =  0;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        int i=100;
        while(i>0){
            test1();
            i--;
        }
    }

    public static void test1() throws InterruptedException {
        Thread t1 = new Thread(()->{
            for(int i=0; i<5000; i++){
                synchronized (lock){
                    counter++;
                }
//                counter++;
            }
        },"t1");

        Thread t2 = new Thread(()->{
            for(int i=5000; i>0; i--){
                synchronized (lock){
                    counter--;
                }
            }
        },"t2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        log.debug("{}", counter);
    }
}
