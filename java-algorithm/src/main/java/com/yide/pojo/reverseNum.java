package com.yide.pojo;


import java.util.*;

public class reverseNum{
    public static void main(String[] args) {
        int input = 1200;
        Solution1 ss = new Solution1();
        System.out.println(ss.reverse(input));
    }
}

class Solution1{
    public int reverse( int x){
        int flag = x<0 ? -1 : 1;
        if(x == 0) return 0;
        int res = 0;
        if(flag<0) x = -x;
        LinkedList<Integer> stk = new LinkedList<>();
        while(x>0){
            stk.add(x%10);
            x = x/10;
        }

        while(!stk.isEmpty()){
            if((flag<0 && res>(Integer.MAX_VALUE-stk.getFirst())/10)  ||
                    (flag>0 && res>(Integer.MAX_VALUE-stk.getFirst())/10) ){
                return 0;
            }
            res = res*10 + stk.removeFirst();
        }

        if(flag <0 )
            return -res;
        return res;
    }
}