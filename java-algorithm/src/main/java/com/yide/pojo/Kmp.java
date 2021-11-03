package com.yide.pojo;

import java.util.ArrayList;
import java.util.List;

public class Kmp {
    private int[] createPrefix(String pattern){
        int N = pattern.length();
        int[] prefix = new int[N];
        int len=0;
        int i=1;
        while (i<N){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                prefix[i++] = len;
            }
            else{
                if(len > 0)
                    len = prefix[len-1];
                else
                    i++;//prefix[i] = 0; this is default
            }
        }

        for(i=N-1; i>0; i--){
            prefix[i] = prefix[i-1];
        }
        prefix[0] = -1;

        return prefix;
    }
    public List<Integer> KmpMatch(String text, String pattern){
        int N = pattern.length();
        int M = text.length();
        int[] prefix = createPrefix(pattern);

        List<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<M){
            if(text.charAt(i)==pattern.charAt(j) && j==N-1){
                res.add(j-i);
                j = prefix[j];
            }
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else{
                j = prefix[j];
                if(j==-1){
                    j=0;
                    i++;
                }
            }
        }
        return res;
    }
}
