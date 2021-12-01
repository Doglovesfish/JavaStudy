package com.第n为位数子;

public class Main {
    public static void main(String[] args) {
        int n = 1000000000;
        System.out.println(new Solution().findNthDigit(n));
    }
}

class Solution {
    public int findNthDigit(int n) {
        long len = 0;
        while(len*9*(int)Math.pow(10, len-1) < n){
            n -= len*9*(int)Math.pow(10, len-1);
            len++;
        }
        long m = n/len, k = n%len;
        long num = (long)Math.pow(10,len-1) + m - 1;
        System.out.println(num);
        if(k==0){
            return (int)(num)%10;
        }
        num++;
        num = num/(long)Math.pow(10, len-k);
        return (int)num%10;
    }
}
