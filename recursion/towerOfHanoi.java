package recursion;

public class towerOfHanoi {
    public static void TOH(int n,char source,char intermediate,char destination)
    {
        if(n==1)
        {
            System.out.println(source+" --> "+destination);
            return;
        }
        TOH(n-1,source,destination,intermediate);
        System.out.println(source+" --> "+destination);
        TOH(n-1,intermediate,source,destination);
    }

    public static void main(String[] args) {
        TOH(4,'A','B','C');
    }









}
