package com.yide.pojo;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        String A = "123";
        String B = "123";
        String C = new String("123");
        System.out.println(A==B);
        System.out.println(A.equals(C));
        Integer[] arr = {1,5,4,2};
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
    }
}
