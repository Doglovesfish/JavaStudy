package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test10 {
    public static void main(String[] args) throws InterruptedException{
        Thread t0 = new Thread(()->{
            while(true){
                boolean interrupted = Thread.currentThread().isInterrupted();
                if(interrupted){
                    log.debug("被打断了，推出循环");
                    break;
                }
            }
        },"t0");
        t0.start();
        Thread.sleep(1000);
        log.debug("interrupt");
        t0.interrupt();
    }
}
