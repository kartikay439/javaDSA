package GreedyMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class minCoinChange {
    public static int coinChange(Integer arr[],int NN)
    {
       ArrayList<Integer> arro=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
       arro.add(arr[i]);
        }
        Collections.sort(arro);
        Collections.reverse(arro);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arro.get(i);
        }
        int ans=-1;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int N=NN;
            int count=0;
            for (int j = i; j <arr.length ; j++) {
                while (arr[j]<=N)
                {
                    N-=arr[j];
                    count++;
                }
            }
            if(N==0)
            {
                ls.add(count);
            }

        }
        if(ls.isEmpty())return -1;
        Collections.sort(ls);
        return ls.get(0);
    }

    public static void main(String[] args) {
        Integer[] arr={9,6,5,1};
        int count=0;
        int N=11;
        System.out.println(coinChange(arr,N));
    }
}
