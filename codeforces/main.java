package codeforces;
import java.util.*;
class main {
    public static void tri(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<2;i++)
        {
            if(arr[i]+arr[i+1]>arr[i+2])
            {
                System.out.println("triangle");
                return;
            }
        }
        for(int i=0;i<2;i++)
        {
            if(arr[i]+arr[i+1]==arr[i+2])
            {
                System.out.println("segment");
                return;
            }
        }
        System.out.println("impossible");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++)
            arr[i]=sc.nextInt();
        tri(arr);
    }
}