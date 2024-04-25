package codeforces;

import java.util.Scanner;

public class haiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr= new String[3];
        for (int i = 0; i <3 ; i++) {
            arr[i]=sc.nextLine();
        }
        int index=0;
        int[] arr2=new int[3];
        for(String i:arr)
        {
            char[] arr1=i.toCharArray();
            int c=0;
            for(char j:arr1)
            {
                if(j=='a' || j=='e' || j=='i' || j=='o' || j=='u')
                {
                    c++;
                }
            }
            arr2[index++]=c;

        }
        for(int i:arr2)
        {
            System.out.println(i);
        }


    }
}
