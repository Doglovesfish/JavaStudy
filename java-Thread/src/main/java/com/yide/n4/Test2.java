package com.yide.n4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test2 extends Thread{


    public static void main(String[] args) throws InterruptedException {
        int i=100;
        while(i>0){
            test1();
            i--;
        }
    }

    public static void test1() throws InterruptedException {
        Room room = new Room();
        Thread t1 = new Thread(()->{
            for(int i=0; i<5000; i++){
                room.increment();
            }
        },"t1");

        Thread t2 = new Thread(()->{
            for(int i=5000; i>0; i--){
                room.decrement();
            }
        },"t2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        log.debug("{}", room.getCounter());
    }
}

class Room{
    private int counter = 0;
    public void increment(){
        synchronized (this){
            counter++;
        }

    }

    public void decrement(){
        synchronized (this) {
            counter--;
        }
    }

    public int getCounter(){
        synchronized (this){
            return counter;
        }
    }
}
