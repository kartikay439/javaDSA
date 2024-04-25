package Sorting;

import java.util.Arrays;

public class MergeSort {
    public int[] MergeSort(int[] arr)
    {
        int length=arr.length;
        if(length>1)
        {

            return merge(MergeSort(Arrays.copyOfRange(arr,0,length/2)),MergeSort(Arrays.copyOfRange(arr,length/2,length)));
        }
        return arr;

    }
    public int[] merge(int[] arr1,int[] arr2)
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
        int[] arr = {12,5,151,0};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.MergeSort(arr);
        System.out.println("Sorted array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }


}
