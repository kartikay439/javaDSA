//package Sorting;
//
//import java.util.Arrays;
//
//public class QuickSort {
//    public static void quickSort(int[] arr, int l, int h) {
//        if (l < h) {
//            int pivot = pivot(arr, l, h);
//            quickSort(arr, l, pivot - 1);
//            quickSort(arr, pivot + 1, h);
//        }
//    }
//
//    public static int pivot(int[] arr, int l, int h) {
//        int pivot = arr[l];
//        int i = l + 1;
//        int j = h;
//        while (i <= j) {
//            while (i <= j && pivot > arr[i]) {
//                i++;
//            }
//            while (i <= j && pivot < arr[j]) {
//                j--;
//            }
//            if (i <= j) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//        }
//
//        arr[l] = arr[j];
//        arr[j] = pivot;
//        return j;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,4,9,3,7,5};
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//    }
//}
//ttxr5