public class Main {
    public static void main(String[] args) {
        int input = 2147395600;
        System.out.println(new Solution().isPerfectSquare(input));
        System.out.println(1073697800*1073697800);
        System.out.println(Math.sqrt(input));
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while(l<=r){
            int mid = l + (r-l>>1);
            if(mid*mid == num) return true;
            if(mid*mid>0 && mid*mid <num){
                l=mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return false;
    }
}
