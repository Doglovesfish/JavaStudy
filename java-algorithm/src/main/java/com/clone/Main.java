package com.clone;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("CH","SD", "QD");
        Customer customer1 = new Customer(1, 23, address);
        Customer customer2 = customer1.clone();

        customer2.getAddress().setCity("JN");
        customer2.setId(2);
        System.out.println("customer1: " + customer1.toString());
        System.out.println("customer2: " + customer2.toString());
    }
}
