package recursion;

public class sumOfDIgits {
    public static int sum(int x)
    {
        if(x%10==x )return x;
        return (x%10)+sum(x/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
