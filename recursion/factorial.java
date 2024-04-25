package recursion;

public class factorial {

    public static Integer factorial(int x)
    {
        if(x==1 )return 1;
        return x*factorial(--x);
    }

    public static void main(String[] args) {
        int x=5;
        System.out.println(factorial(5));
    }
}
