package recursion;

public class fibonacci {
    public static int fibonacci(int x)
    {
        if(x==1 || x==0)return x;
        return fibonacci(x-2)+fibonacci(x-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
