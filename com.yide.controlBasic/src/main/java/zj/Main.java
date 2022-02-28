package zj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), k = Integer.parseInt(strs[1]);
        int[] nums = new int[n];
        boolean[] flag = new boolean[n];
        strs = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        String s = br.readLine();
        for(int i=0; i<n; i++){
            flag[i] = 'R'==s.charAt(i);
        }
        System.out.println(lowestCost(flag,nums,k));
    }

    private static int lowestCost(boolean[]flag, int[] nums, int k){
        int n = nums.length;
        if(n<k) return 0;
        int cost = 0, res = 0, r = 0;
        for(int i=0; i<k; i++){
            if(!flag[i]){
                cost+=nums[i];
            }
        }
        r=k;
        while (r<n){
            if(!flag[r]){
                cost+=nums[r];
            }
            if(!flag[r-k]){
                cost-=nums[r-k];
            }
            r++;
            res = Math.min(res, cost);
        }
        return cost;
    }
}




