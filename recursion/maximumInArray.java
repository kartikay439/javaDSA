package recursion;

import java.util.Arrays;

public class maximumInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{5,4,7,8,9,6,3,12};
        System.out.println(max(arr));
//        System.out.println(Arrays.copyOfRange(arr,1,1)[0]);

    }
    public static int max(int[] arr)
    {
        if(arr.length > 2)
        return Math.max(arr[0],max(Arrays.copyOfRange(arr,1,arr.length)));
        return Math.max(arr[0],arr[1]);
    }


}
