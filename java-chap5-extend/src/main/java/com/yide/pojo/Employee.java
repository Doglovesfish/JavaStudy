package com.yide.pojo;

public class Employee{
    private long Id;
    private int Age;
    private static int nextId = 1;

    public Employee(){
        this.Id = nextId;
        this.Age = 10;
        nextId++;
    }

    public long getId() {
        return Id;
    }

    public void setId() {
        Id = nextId;
        nextId++;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    private static int getNextId() {
        return nextId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Age=" + Age +
                '}';
    }
}
