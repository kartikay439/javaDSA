package dynamic_programming;
//  T(n)=O(n); -> memoization    || recursion  ->  T(n)=O(2^n)
public class climbingStairs {
    public static int countWays(int n,int[] dp) {
        if(n<0)return 0;
        if(n==0)return 1;
        if(dp[n]==-1)return dp[n];
        return  countWays(n-1,dp)+countWays(n-2,dp);
    }
 public static int countWays3(int n,int[] dp) {
        if(n<0)return 0;
        if(n==0)return 1;
        if(dp[n]==-1)return dp[n];
        return  countWays(n-1,dp)+countWays(n-2,dp)+countWays(n-3,dp);
    }
    public static int countWaysTabulation(int n) {
        int[] dp=new int[n+1];

        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            if(i==1)
            {
                dp[i]=dp[i-1];
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return  dp[n];
    }


    public static void main(String[] args) {
        int n=5;
//        int[] dp=new int[n+1];
        System.out.println(countWaysTabulation(n));
    }
}
