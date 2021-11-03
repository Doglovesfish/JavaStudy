package com.yide.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIncreSonArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,25,4,8,6};

        Solution ss = new Solution();
        System.out.println(Arrays.toString(ss.LIS(nums)));
    }

}

class Solution{
    public int[] LIS(int[] nums){
        int n = nums.length;
        int len =  0;

        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            len = Math.max(len,dp[i]);
        }

        int[] res = new int[len];
        for(int i=n-1; i>=0; i--){
            if(len == dp[i]){
                res[len-1]= nums[i];
                len--;
            }
        }
        return res;
    }
}

