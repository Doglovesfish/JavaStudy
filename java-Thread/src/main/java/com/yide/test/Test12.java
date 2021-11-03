package com.yide.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

@Slf4j(topic = "c.Test12")
public class Test12 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            log.debug("park....");
            LockSupport.park();
            log.debug("unpark...");
            log.debug("打断状态：{}", Thread.currentThread().isInterrupted());

            LockSupport.park();//打断标记为真时，park会失效
            log.debug("unpark....");
        },"t1");
        t1.start();

        Thread.sleep(5000);
        t1.interrupt();//主线程打断t1
    }
}
