package com.yide.n3;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

@Slf4j
public class TestJoin {
    static int r = 0;
    static int r1 = 0;
    static int r2 = 0;

    public static void main(String[] args) throws InterruptedException{
        test3();
    }

    private static void test2() throws InterruptedException{
        Thread t1 = new Thread(()->{
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r1 = 10;
        });

        Thread t2 = new Thread(()->{
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r2 = 20;
        });

        t1.start();
        t2.start();
        long start = System.currentTimeMillis();
        log.debug("join begin");
        t1.join();
        log.debug("t1 join end");
        t2.join();
        log.debug(("t2 join end"));

        long end = System.currentTimeMillis();
        log.debug("r1: {} r2:{}",r1,r2,end-start);

    }

    private static void test3() throws InterruptedException{
        Thread t1 = new Thread(()->{
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r1 = 10;
        });

        long start = System.currentTimeMillis() ;
        t1.start();

        log.debug("join begin");
        t1.join(4000);
        long end = System.currentTimeMillis();
        log.debug("r1: {} r2: {} cost: {}", r1, r2, end - start);
    }
}
