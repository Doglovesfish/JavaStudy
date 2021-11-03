package com.yide.pojo;

import Domain.Person;

import java.io.File;
import java.lang.reflect.Field;

public class Reflection2 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Field[] fields = personClass.getFields();
        for(Field field : fields){
            System.out.println(field);
        }
        // Filed[] getFileds()
        Field a = personClass.getField("a");
        Person p = new Person();
        Object result = a.get(p);
        a.set(p,"zhangsan");
        System.out.println(result);
        System.out.println(p.toString());

        System.out.println("=======================");

        Field[] declareFields = personClass.getDeclaredFields();
        for(Field declaredField :  declareFields){
            System.out.println(declaredField);
        }

        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);//force Reflection
        Object value = d.get(p);
        System.out.println(value);



    }
}
