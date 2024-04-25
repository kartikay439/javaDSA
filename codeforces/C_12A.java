package codeforces;

import java.util.Scanner;

public class C_12A {
    public static boolean superAgent(String s)
    {
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
//                System.out.println(s.charAt(i)+"   "+s.charAt(s.length()-i-1));
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="";
        for (int i = 0; i <3 ; i++) {
            s+=sc.nextLine();
        }
//        System.out.println(s);
        if(superAgent(s)) System.out.println("YES");
        else System.out.println("NO");

    }
}
