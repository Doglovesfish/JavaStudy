package priorityqueue;
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<int[]> nums = new LinkedList<>();
        for(int i=0; i<profits.length; i++){
            nums.add(new int[]{capital[i], profits[i]});
        }
        Collections.sort(nums, new Comparator<int[]>(){
            @Override
            public int compare(int[]a, int[]b){
                return a[0]-b[0];
            }
        });

        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        while(k-->0){
            while(i<profits.length && nums.get(i)[0]<=w){
                pq.add(nums.get(i)[1]);
                i++;
            }
            w += pq.remove();
        }
        return w;

    }
}