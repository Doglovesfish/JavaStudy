package com.yide.test;

import lombok.extern.slf4j.Slf4j;

import javax.swing.plaf.TableHeaderUI;

@Slf4j
public class Test13 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            log.debug("running...");
        },"t1");

        Thread t2 = new Thread(()->{
            while(true){//runnable

            }
        },"t2");
        t2.start();

        Thread t3 = new Thread(()->{
            log.debug("running");
        },"t3");
        t3.start();

        Thread t4 = new Thread(()->{
            synchronized (Test13.class){
                try {
                    Thread.sleep(100000);  //time_waiting
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t4");
        t4.start();

        Thread t5 = new Thread(()->{
            try {
                t2.join();                      //waiting forever
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"t5");
        t5.start();

        Thread t6 = new Thread(()->{
            synchronized (Test13.class){
                try {
                    Thread.sleep(1000);    // t2一直占用着锁，t6就处于blocked状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t6");
        t6.start();

        log.debug("t1 state {}", t1.getState());
        log.debug("t2 state {}", t2.getState());
        log.debug("t3 state {}", t3.getState());
        log.debug("t4 state {}", t4.getState());
        log.debug("t5 state {}", t5.getState());
        log.debug("t6 state {}", t6.getState());
    }

}
