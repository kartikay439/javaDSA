package codeforces;

import java.util.Scanner;

public class chips {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=1;
        while(true)
        {
            c%=n;
            if(c==0)c=n;

            if((m-c)>=0) {
                m -= c;
            }
            else
            {
                System.out.println(m);
                break;
            }

            c++;
        }
    }
}
