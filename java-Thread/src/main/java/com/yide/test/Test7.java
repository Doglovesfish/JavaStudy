package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test7 {
    public static void main(String[] args) {
        Thread t0 = new Thread("t0"){
            @Override
            public void run(){
                log.debug("enter sleep");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    log.debug("wake up...");
                    e.printStackTrace();
                }
            }
        };

        t0.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.debug("interrupt...");
        t0.interrupt();
    }
}
