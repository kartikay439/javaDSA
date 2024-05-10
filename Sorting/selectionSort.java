package Sorting;


import queue.circularQueue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionSort {
    public static int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1 ; i++) {
            int j=min(Arrays.copyOfRange(arr,i,arr.length))+i;
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i:arr) System.out.print(i+" ");
        return arr;
    }
    public static int min(int[] arr)
    {

        int min=arr[0];
        int index=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,8,1,7,33,2,9,7};
        selectionSort(arr);
        System.out.println(arr.toString());

    }
}
