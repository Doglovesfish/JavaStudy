package com.yide.pojo;
import  java.util.*;
import java.util.stream.IntStream;

public class IntStreamTest {

    public static void main(String[] args) {
        int end = 11;
        Integer[] res= IntStream.range(0, end).boxed().toArray(Integer[]::new);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
