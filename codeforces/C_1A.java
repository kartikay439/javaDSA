package codeforces;

import java.util.Scanner;

public class C_1A {
    public static long theatreSquare(double m,double n,double a)
    {
        return (long) (Math.ceil(m/a)*Math.ceil(n/a));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double m=sc.nextInt();
        double a=sc.nextInt();
//        System.out.println(m/a);
        System.out.println(theatreSquare(m,n,a));
    }
}
