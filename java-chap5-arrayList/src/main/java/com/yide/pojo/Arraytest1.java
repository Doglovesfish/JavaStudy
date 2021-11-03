package com.yide.pojo;

import java.util.ArrayList;
import java.util.List;

public class Arraytest1 {
    public static void main(String[] args) {
        int N = 655360;
        int[] a = new int[N];
//        System.out.println()

        List<List<Integer>> lists =  new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        lists.add(list1);
        System.out.println(lists.toString());

        list1.set(0,2);
        System.out.println(lists.toString());

        System.out.println();
        Integer tmp = 3;
        list1.add(tmp);
        tmp = 4;
        System.out.println(list1);
        System.out.println(lists);

        System.out.println();

    }
}
