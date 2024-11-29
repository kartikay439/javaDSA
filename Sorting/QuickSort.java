package Sorting;

public class QuickSort {
    static  void  quickSort(int[] arr,int i,int j){
        if(i<=j) {
            int p = pivot(arr, i, j);
            quickSort(arr, i, p - 1);
            quickSort(arr, p + 1, j);
        }
    }
    static int pivot(int[] arr,int i,int j){
        // c -->  current index till that element is smaller than last pivot element
        int c = i-1;
        int pivot = arr[j];
        for (int k = i; k <j ; k++) {
            if(arr[k]<pivot){
                // goto new index for store element less than pivot element
                c++;
                int temp = arr[k];
                arr[k]=arr[c];
                arr[c]=temp;
            }
        }
        //now till c all elements are smaller than pivot
        c++;
        int temp = arr[c];
        arr[c] = pivot;
        arr[j] = temp;
        return c;
        // ignore c index and part array
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,9,2,1,3,45,1,45,87,99,4};
        //i:array start index  j:array end index
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }




}
