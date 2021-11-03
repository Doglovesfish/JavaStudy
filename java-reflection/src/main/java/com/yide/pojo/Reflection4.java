package com.yide.pojo;

import Domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection4 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Method method = personClass.getMethod("eat");
        Method method2 = personClass.getMethod("eat", String.class);

        Person p = new Person();

        method.invoke(p);

        method2.invoke(p,"hothot");

        System.out.println("++++++++++++++++++++");

        Method[] methods = personClass.getMethods();
        for(Method v : methods){
            System.out.println(v);
            System.out.println(v.getName());
        }

    }
}
