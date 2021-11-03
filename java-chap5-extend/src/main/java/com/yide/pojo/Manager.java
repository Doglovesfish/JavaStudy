package com.yide.pojo;

public class Manager extends Employee{
    private String logo = "I am manager";
    private int Age;
    private long Id;
    public Manager(){
    }

    @Override
    public String toString() {
        return "Manager{" +
                "logo='" + logo + '\'' +
                '}';
    }
}
