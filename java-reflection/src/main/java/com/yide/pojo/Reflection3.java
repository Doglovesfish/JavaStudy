package com.yide.pojo;

import Domain.Person;

import java.lang.reflect.Constructor;

public class Reflection3 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);


        Object person = constructor.newInstance("zhangsan", 3);
        System.out.println(person.toString());
    }
}
