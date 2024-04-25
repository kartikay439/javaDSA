package google_1500;

import java.util.Arrays;

public class max {
    public static int find(int[] arr,int n)
    {
        int cost=0;
        while (n-->0)
        {
            Arrays.sort(arr);
            int a=arr[0];
            int b=arr[arr.length-1];
            arr[0]=(int) Math.ceil(a+b);
            cost+=arr[0];
            arr=Arrays.copyOfRange(arr,0,arr.length-1);

        }
        return cost;

    }


    public static void main(String[] args) {
        System.out.println(find(new int[]{5,4,3,2,1},2));
    }
}
