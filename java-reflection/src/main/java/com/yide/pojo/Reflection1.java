package com.yide.pojo;

import Domain.Person;

public class Reflection1 {
    public static void main(String[] args) throws Exception {

        //1.Class.forName("全类名")
        Class class1 = Class.forName("Domain.Person");
        System.out.println(class1);

        //2.
        Class class2 = Person.class;
        System.out.println(class2);

        //
        Person p = new Person();
        Class class3 = p.getClass();
        System.out.println(class3);


    }
}
