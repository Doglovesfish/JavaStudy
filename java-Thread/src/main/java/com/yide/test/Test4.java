package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test4 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){


                log.debug("running");
            }
        };
        t.setName("t0");
//        t.run();
        t.start();
        log.debug("do other things");
    }
}
