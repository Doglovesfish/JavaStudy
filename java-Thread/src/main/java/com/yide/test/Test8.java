package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test8 {
    static int r = 0;
    public static void main(String[] args) {
        Thread t0 = new Thread("t0"){
            @Override
            public void run(){
                log.debug("begin..");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                r = 10;
            }
        };

        t0.start();
        try {
            t0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.debug("result :{}" ,r);
        log.debug("ending");
    }
}
