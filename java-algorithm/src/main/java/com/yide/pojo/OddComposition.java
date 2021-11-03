package com.yide.pojo;

import java.util.*;

public class OddComposition {

    public List<Integer> getOddComposition(int N){
        List<Integer> nums = getNums(N);
        Map<Integer, List<Integer>> mp = new HashMap<Integer, List<Integer>>();
        Set<Integer> st=  new HashSet<>();
        for(int i=0; i<nums.size(); i++){
            if(st.contains(N)){
                System.out.println(mp.get(N).toString());
            }
            Set<Integer> tmp = st;
            for(Integer v: tmp){
                Integer curVal = v+nums.get(i);
                tmp.add(curVal);
                mp.get(curVal).add(nums.get(i));

            }

        }
        return nums;
    }

    private List<Integer> getNums(int N){
        List<Integer> nums = new ArrayList<>();
        if(N<=0) return nums;
        for(int i=1; i<N+1; i++){
            if(i%2==1)
                nums.add(i);
        }
        return nums;
    }

}
