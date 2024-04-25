package google_1500;

import java.util.HashMap;
import java.util.LinkedList;

public class longest_substring {
    public  static int logestSubstringWithoutRepetition(String s)

    {
        if(s.length()==0)
        {
            return 0;
        }
        LinkedList<Character> ls = new LinkedList<>();
        char[] stringArray=s.toCharArray();
        int left=0,right=0,lp=0,rp=0;    //lp---> leftPointer    rp---> rightPointer
        int maxTill=0;
//        System.out.println("String length: "+s.length());
        for (int j= 0; j <s.length() ; j++,rp++) {
            char i =s.charAt(j);
            if(ls.contains(i) && (ls.size()>=maxTill))
            {


                left=lp;right=rp-1;
                maxTill=ls.size();
//                System.out.println("right: "+rp+"left: "+lp);

                int temp=rp-1;
                while (stringArray[temp]!=i)
                {
                    temp--;
                }
                lp=temp+1;



                ls.clear();
                temp=lp;
                while (temp!=rp)
                {
                    ls.add(stringArray[temp]);
                    temp++;
                }
                ls.add(i);
            }
            else if(ls.contains(i))
            {
                int temp=rp-1;
                while (stringArray[temp]!=i)
                {
                    temp--;
                }
                lp=temp+1;



                ls.clear();
                temp=lp;
                while (temp!=rp)
                {
                    ls.add(stringArray[temp]);
                    temp=temp+1;
                }
                ls.add(i);


            }
            else if ((j==s.length()-1) && ls.size()>=maxTill) {
                ls.add(i);
                right=rp;
                left=lp;
                maxTill=ls.size();
            }
            else
            {
                ls.add(i);
            }
            System.out.println("lp : "+lp+"size :"+ls.size()+ls.toString());

        }

        return maxTill;


    }

    public static void main(String[] args) {

        System.out.println(logestSubstringWithoutRepetition("sunny"));

    }
}
