package dynamic_programming;

public class binaryKnapSack {
    public static int tabulation(int val[],int[] wt,int W)
    {
        int n=val.length;
        int dp[][] =new int[n+1][W+1];
        for (int i = 0; i < dp.length ; i++) { //Oth col
            dp[i][0]=0;
        }

        for (int j = 0; j <dp[0].length ; j++) {//0th row
            dp[0][j]=0;
        }
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <W+1 ; j++) {
                int v=val[i-1];
                int w=wt[i-1];
               if(w<=j)
               {
                   //valid
                   int incProfit = v+ dp[i-1][j-w];
                   int excProfit = dp[i-1][j];
                   dp[i][j]=Math.max(incProfit,excProfit);
               }
               else
               {
                   int excProfit = dp[i-1][j];
                   dp[i][j]=excProfit;
               }
            }
        }
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print(dp[i][j]+"    ");
            }
            System.out.println();
        }
        return dp[n][W];
    }
    public static int memoization(int val[],int wt[],int W,int n,int dp[][])
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        if(dp[W][n]!=-1)
        {
            return dp[W][n];
        }
        if(wt[n-1] <= W)
        {
            //include
            int ans1 = val[n-1]+memoization(val,wt,W-wt[n-1],n-1,dp);
            //exclude
            int ans2 = memoization(val,wt,W,n-1,dp);
            dp[W][n]=Math.max(ans1,ans2);
            return Math.max(ans1,ans2);
        }
        else
        {
            dp[W][n]=memoization(val,wt,W,n-1,dp);;
            return   dp[W][n];
        }
    }

    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[W+1][val.length+1];

        for (int i = 0; i <W+1 ; i++) {
            for (int j = 0; j <val.length+1 ; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(tabulation(val,wt,W));

    }
}
