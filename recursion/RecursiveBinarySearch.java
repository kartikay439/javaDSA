package recursion;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,16};
        System.out.println(binarySearch(arr,16));
    }
    public static boolean binarySearch(int[] arr,int target)
    {
        if(arr.length > 2 )
        {
            int mid = arr.length / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) return binarySearch(Arrays.copyOfRange(arr, mid+1, arr.length), target);
            else if (arr[mid] > target) return binarySearch(Arrays.copyOfRange(arr, 0, mid), target);
        }
        return target==arr[0] || target==arr[1];
    }
}
