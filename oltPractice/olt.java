package oltPractice;

public class olt{
    public static int[] cumulativeSum(int[] arr)
    {
        int s=0;
        int[] arre=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            s+=arr[i];
                    arre[i]=s;
            System.out.println(s+" ");
        }
        return arre;
    }
    public static void evenDigits(int[] arr)
    {
        for (int i:arr)
        {
            if((i+"").length()%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
        evenDigits(arr);
    }
}
