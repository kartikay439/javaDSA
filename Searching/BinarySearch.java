package Searching;

import java.util.Arrays;

class BinarySearch {
    public static int linearSearch(Student[] arr,Student target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].cpi==target.cpi && arr[i].name.equals(target.name))return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target)
    {
      int s=0;
      int e=arr.length-1;
      while(s<=e)
      {
          int mid=s+(e-s)/2;
          if((arr[mid]+"").equals(target+""))
          {
              return mid;
          } else if (arr[mid]<target) {
              s=mid+1;
          }
          else
          {
              e=mid+-1;

          }

      }
      return -1;
    }
    public static int binarySearchR(int[] arr,int s,int e,int target)
    {


            int mid=(e+s)/2;
            if(mid>arr.length-1 || mid<0)return -1;
            if((arr[mid]+"").equals(target+""))
            {
                return mid;
            } else if (arr[mid]<target) {
                binarySearchR(arr,mid+1,e,target);
            }
            else
            {
                binarySearchR(arr,s,e-1,target);


            }


        return -1;
    }
    public static void bubbleSort(String[] arr)
    {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[i].compareTo(arr[i+1])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        String arr[]={"hello","joker","sportsmen"};
        bubbleSort(arr);
        for (String i:arr) {
            System.out.println(i);
        }
        Student s1=new Student("A",6.5f);
        Student s2=new Student("B",6.5f);
        Student s3=new Student("C",6.5f);
        Student s4=new Student("D",6.5f);
    }

}
