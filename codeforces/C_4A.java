package codeforces;

import java.util.Scanner;

public class C_4A {
    public static boolean watermelon(int n)
    {
        if(n<=2)return false;
        if(n%2==0)return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(watermelon(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
