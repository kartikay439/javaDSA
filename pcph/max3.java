package pcph;

import java.util.Arrays;

public
class max3 {
    public static void max3(int[] arr)
    {

        if(arr.length<=0)
        {
            for (int i = arr.length-1; i >=0 ; i--) {
                System.out.println(arr[i]);
            }
            return;
        }
        Arrays.sort(arr);

        for (int i = arr.length-1; i >=arr.length-3 ; i--) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr={1};
        max3(arr);
    }
}
