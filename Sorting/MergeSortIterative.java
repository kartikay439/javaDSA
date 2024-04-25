package Sorting;

import java.util.Arrays;

public class MergeSortIterative {
//    public int[] MergeSort(int[] arr\)
//    {
//        int length=arr.length;
//        if(length>1)
//        {
//
//            return merge(MergeSort(Arrays.copyOfRange(arr,0,length/2)),MergeSort(Arrays.copyOfRange(arr,length/2,length)));
//        }
//        return arr;
//
//    }
    static public int[] merge(int[] arr1,int[] arr2)
    {
        int[] temp=new int[arr1.length+arr2.length];
        int p1=0,p2=0,i=0;
        while (p1<arr1.length && p2<arr2.length)
        {
            if(arr1[p1]<=arr2[p2])
            {
                temp[i++]=arr1[p1++];
            }
            else
            {
                temp[i++]=arr2[p2++];
            }
        }

        while (p1<arr1.length)
        {
            temp[i++]=arr1[p1++];
        }
        while (p2<arr2.length)
        {
            temp[i++]=arr2[p2++];
        }

        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,8,10};
        int[] arr2 = {1,5,151,160};
        int[] a=merge(arr,arr2);
        for(int i:a)
            System.out.print(i+"  ");

    }


}
