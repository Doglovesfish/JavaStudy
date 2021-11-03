package com.yide.test;

import javax.swing.plaf.TableHeaderUI;

public class Sleeper {
    public static void sleep(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
