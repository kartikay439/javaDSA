package dynamic_programming;

public class fibonacci {
    public static Integer[] memo=new Integer[100];
    public static  int fibonacci(int n)
    {
        if(n==0 || n==1)return n;

        if(memo[n]!=null)
        {
            return memo[n];
        }
        else
        {
            memo[n]=fibonacci(n-1)+fibonacci(n-2);
            return memo[n];
        }
    }
    public static Integer tab_fib(int n)

    {
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=n ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(tab_fib(3));
    }
}
