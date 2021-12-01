package com.整数除法;

public class Main {
    public static void main(String[] args) {
        int [] input = {1100540749, -1090366779};
        new Solution().divide(input[0], input[1]);
    }
}

class Solution {
    public int divide(int a, int b) {
        if(a == 0) return 0;
        int out = Integer.MAX_VALUE;
        if(a==Integer.MIN_VALUE){
            if(b==-1){
                return out;
            }
            if(b==1){
                return a;
            }
        }

        boolean flag = false;
        if((a>0 && b>0) || (a<0 && b<0)) {
            flag = true;
        }
        if(a>0) a = -a;
        if(b>0) b = -b;
        int cnt = 0;
        int tmp = b;
        int k=1;
        while(a <= tmp){
            b = tmp;
            k = 1;
            while( a <= b){
                a = a-b;
                cnt += k;
                b += b;
                k += k;
            }
        }
        return flag ? cnt : -cnt;
    }
}
