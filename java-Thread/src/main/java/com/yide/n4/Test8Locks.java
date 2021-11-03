package com.yide.n4;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

@Slf4j(topic = "Test8Locks")
public class Test8Locks {
    public static void main(String[] args) {
        Number n1 = new Number();
        new Thread(()->{
            log.debug("begin");
            try {
                n1.a();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            log.debug("begin");
            n1.b();
        }).start();

        new Thread(()->{
            log.debug("begin");
            n1.c();
        }).start();
    }
}


@Slf4j(topic = "c.Number")
class Number {
    public synchronized void a() throws InterruptedException {
        sleep(1000);
        log.debug("1");
    }

    public synchronized void b(){
        log.debug("2");
    }

    public void c(){
        log.debug("3");
    }
}
