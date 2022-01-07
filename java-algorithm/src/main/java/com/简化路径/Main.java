package com.简化路径;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution ss = new Solution();
        String path = "/a//b////c/d//././/..";
        System.out.println(ss.simplifyPath(path));
    }
}

class Solution {
    public String simplifyPath(String path) {
        if(path.length()==0) return "";

        path += "/";
        int n = path.length();
        int i = -1;
        Deque<String> dq = new LinkedList<>();
        for(int j=0; j<n; j++){
            if(path.charAt(j)!='/') continue;
            if(i+1!=j){
                String cur = path.substring(i+1, j);
                if(cur.equals(".")){

                }
                else if(cur.equals("..")){
                    if(!dq.isEmpty()){
                        dq.removeLast();
                    }
                }
                else{
                    dq.addLast(cur);
                }
            }
            i=j;
        }
        if(dq.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while(dq.size()>1){
            sb.append(dq.removeFirst());
            sb.append("/");
        }
        sb.append(dq.removeLast());

        return sb.toString();
    }
}