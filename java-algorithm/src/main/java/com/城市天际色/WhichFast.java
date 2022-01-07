package com.城市天际色;

import java.util.Random;

public class WhichFast {
    public static void main(String[] args) {
        Solution  ss = new Solution();
        int n = 10000;
        int[][] grid = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = new Random().nextInt();
            }
        }
        long s_time = System.currentTimeMillis();
        ss.func1(grid);
        long e_time = System.currentTimeMillis();
        System.out.println("func1 "+ (e_time-s_time));

        s_time = System.currentTimeMillis();
        ss.func2(grid);
        e_time = System.currentTimeMillis();
        System.out.println("func2 " + (e_time-s_time));



    }
}

class Solution {
    public void func1(int[][] grid) {
        int n = grid.length;
        int[] row = new int[n], col = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                row[i] = Math.max(row[i], grid[i][j]);
            }
        }
        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
    }

    public void func2(int[][] grid) {
        int n = grid.length;
        int[] row = new int[n], col = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
    }
}

