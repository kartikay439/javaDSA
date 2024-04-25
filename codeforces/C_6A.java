package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class C_6A {
    public  static void triangle(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-2 ; i++) {
            if(arr[i]+arr[i+1]<arr[i+2])
            {
                System.out.println("TRIANGLE");
                return;
            }
        }
        for (int i = 0; i <arr.length-2 ; i++) {
            if(arr[i]+arr[i+1]==arr[i+2])
            {
                System.out.println("SEGMENT");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for (int i = 0; i <4 ; i++) {
            arr[i]=sc.nextInt();
        }
        triangle(arr);
    }
}
