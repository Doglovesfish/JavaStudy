package com.yide.pojo;

import Domain.Person;
import Domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//        p.eat();
//        Student stu = new Student();
//        stu.sleep();

        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");

        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // load this class into
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(obj);
    }
}
