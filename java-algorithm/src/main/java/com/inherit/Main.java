package com.inherit;

public class Main {
    public static void main(String[] args) {

        Animals animals = new Cat();
        System.out.println(animals.eat);
        Cat cat = new Cat();
        cat.getEat();
    }


}
