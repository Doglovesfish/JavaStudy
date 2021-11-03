package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test16 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            log.debug("xi shui hu");
            Sleeper.sleep(1);
            log.debug("shao kai shui");
            Sleeper.sleep(5);

        },"Wang");

        Thread t2 = new Thread(()->{
           log.debug("xi cha hu");
           Sleeper.sleep(1);
           log.debug("xi cha bei");
           Sleeper.sleep(2);
           log.debug("na cha ye");
           Sleeper.sleep(1);

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            log.debug("pao cha");

        },"Li");

        t1.start();
        t2.start();

    }
}
