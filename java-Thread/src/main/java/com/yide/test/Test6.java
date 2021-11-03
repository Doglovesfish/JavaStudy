package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test6 {
    public static void main(String[] args) {
        Thread t0 = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t0.setName("t0");
        System.out.println(t0.getState());
        t0.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t0.getState());

    }


}
