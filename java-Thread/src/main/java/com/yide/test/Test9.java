package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(()->{
           log.debug("sleep");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t0");

        t0.start();
//        Thread.sleep(1000);
        log.debug("interrupt");
        t0.interrupt();
        log.debug("打断标记：{}",t0.isInterrupted());
    }
}
