package com.yide.pojo;

import java.util.ArrayList;
import java.util.List;

public class KmpSearch {
    private List<Integer> resIndex;
    private char[] text;
    private char[] pattern;
    private int[] prefix;
    private int N;

    public KmpSearch(String text, String pattern){
        this.N = pattern.length();
        this.prefix = new int[N];
        this.text = text.toCharArray();
        this.pattern = pattern.toCharArray();
        this.resIndex = new ArrayList<>();
    }

    private void prefixTable(){
        prefix[0] = 0;
        int i=1;
        int len=0;
        while(i<N){
            if(pattern[i]==pattern[len]){
                len++;
                prefix[i] = len;
                i++;
            }
            else{
                if(len>1){
                    len = prefix[len-1];
                }
                else{
                    len =0;
                    i++;
                }
            }
        }

        for(i=N-1; i>0; i--){
            prefix[i] = prefix[i-1];
        }
        prefix[0] = -1;
    }

    private void search(){
        int i=0, j=0;
        while(i<text.length){
            if(j == N-1 && text[i] == pattern[j]){
                System.out.printf("this is one of the begin： %d \n", i-j);
                resIndex.add(i-j);
                j = prefix[j];
            }
            if(text[i] == pattern[j]){
                i++;
                j++;
            }
            else{
                j = prefix[j];
                if(j==-1){//j回到头部
                    j++;
                    i++;
                }
            }
        }
    }
    public List<Integer> getIndex(){
        this.prefixTable();
        for(int v: prefix)
            System.out.printf(v+" ");
        this.search();
//        System.out.println(resIndex.isEmpty());
        return resIndex;
    }

}
