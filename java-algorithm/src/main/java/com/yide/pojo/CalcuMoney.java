package com.yide.pojo;

import java.util.*;

public class CalcuMoney {
    public static void main(String[] args) {
//        List<Integer> A = new ArrayList<>();
//        A.add(180);
//        A.add(-50);
//        A.add(-25);
//        A.add(-25);
        List<Integer> A = Arrays.asList(180,-50,-25,-25);



        List<String> D = new ArrayList<>();
        D.add("2020-12-31");
        D.add("2020-12-22");
        D.add("2020-12-11");
        D.add("2020-12-03");

        System.out.println(new Calculate().calcuMoney(A,D));
    }
}

class Calculate{
    int calcuMoney(List<Integer> A, List<String> D){
        int sum = 0;
        int n = A.size();
        int count = 12;
        Map<Integer,int[]> mp= new HashMap<>();

        for(int i=0; i<n; i++){
            sum += A.get(i);
            int month = Integer.valueOf( D.get(i).substring(5,6));
            if(A.get(i)<0){
                int[] date = mp.getOrDefault(month, new int[2]);
                date[0] += 1;
                date[1] += i;
                mp.put(month,date);
            }
        }

        for(int[] date: mp.values()){
            if(date[0]>=3 && date[1] <= -100){
                count--;
            }
        }
        return sum - 5*count;
    }
}
