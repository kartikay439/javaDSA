package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mergeIntervals {
    public static int[][] merge(int[][] intervals)
    {
        for(int i=0;i<intervals.length;i++)
        {
            for (int j = 0; j <intervals.length-i-1 ; j++)
            {
                if(intervals[j][0]>intervals[j+1][0])
                {
                    int temp1=intervals[j][0];
                    int temp2=intervals[j][1];
                    intervals[j][0]=intervals[j+1][0];
                    intervals[j][1]=intervals[j+1][1];
                    intervals[j+1][0]=temp1;
                    intervals[j+1][1]=temp2;
                    
                } else if (intervals[j][0]==intervals[j+1][0]) {
                    if(intervals[j][1]>intervals[j+1][1])
                    {
                        int temp1=intervals[j][0];
                        int temp2=intervals[j][1];
                        intervals[j][0]=intervals[j+1][0];
                        intervals[j][1]=intervals[j+1][1];
                        intervals[j+1][0]=temp1;
                        intervals[j+1][1]=temp2;
                    }
                }
            }
        }
int a=0,b=0,j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 1,k=0; i <intervals.length ;) {
            if(k>intervals.length-1 ||i>intervals.length-1)break;

            b = intervals[j][1];
            if(b>=intervals[i][0]) {
//                System.out.println("i"+i);
                if(k>intervals.length-1 || i>intervals.length-1)break;

                while (b >= intervals[i][0] && k<intervals.length-1 && i<intervals.length-1) {
                    if(k>=intervals.length-1 || i>=intervals.length-1)break;

                    a = intervals[k][0];
                    j=i;
                    b = intervals[i++][1];
                }
                map.put(a, b);
            }
            else
            {
                if(k>intervals.length-1 ||i>intervals.length-1)break;

//                System.out.println("else");
                k=i;
//                System.out.println(k);
                if(k>intervals.length-1)
                {
                    break;
                }
                a=intervals[k][0];
                b=intervals[k][1];
                map.put(a, b);
                i++;

            }


        }
        int arr[][]=new int[map.size()][2];
        int i=0;
       for(Map.Entry<Integer,Integer> e:map.entrySet())
       {
           arr[i][0]=e.getKey();
           arr[i++][1]=e.getValue();
       }
//        for (int k = 0; k <arr.length ; k++) {
//            System.out.println(arr[k][0]+" "+arr[k][1]);
//        }
        return arr;
    }

    public static void main(String[] args) {
        merge(new int[][]{{1,4},{4,5}});
    }

}
