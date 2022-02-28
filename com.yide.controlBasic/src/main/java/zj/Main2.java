package zj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), k = Integer.parseInt(strs[1]);
        int[] nums = new int[n];
        for(int i=1; i<=k; i++) {
            nums[i - 1] = i;
        }
        if(n==k+1){
            nums[n-1]=n;
            for(int i=0; i<n; i++){
                System.out.print(nums[i] + " ");
            }
            return;
        }
        int l1 = k+1, l2 = k+2;
        int index = k;
        while (l2<=n){
            nums[index++] = l2;
            l2+=2;
        }
        while (l1<=n) {
            nums[index++] = l1++;
            l1 += 2;
        }
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
