package com.边界着色;

public class Main {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,2,2} ,{2,3,2}};
        int row = 0, col = 1, color = 3;
        int[][] res = new Solution().colorBorder(grid,row,col,color);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}


class Solution {
    private int oriColor, tarColor, m , n;
    private boolean[][] searched;
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        if(grid[row][col] == color){
            return grid;
        }
        oriColor = grid[row][col];
        tarColor = color;
        m = grid.length;
        n = grid[0].length;
        searched = new boolean[m][n];
        dfs(grid, row, col);
        return grid;
    }

    boolean dfs(int[][] grid, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n){
            return false;
        }

        if(searched[i][j]){
            return true;
        }

        if(grid[i][j] != oriColor){
            return false;
        }

        searched[i][j] = true;

        boolean left = dfs(grid, i, j-1);
        boolean right = dfs(grid, i, j+1);
        boolean top = dfs(grid, i+1, j);
        boolean bottom = dfs(grid, i-1, j);

        if(!left || !right || !top || !bottom){
            grid[i][j] = tarColor;
        }
        return true;
    }
}
