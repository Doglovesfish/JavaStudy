package com.inherit;

public class Animals {
    String eat;
//    Animals( String animalEat){
//       eat =animalEat;
//    }
}

class Cat extends Animals{
    String sonEat;
////    Cat(){
////        this.eat = "123";
//        sonEat = "sonEat";
//    }

    void getEat(){
        System.out.println(this.sonEat);
    }
}

