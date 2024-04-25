package google_1500;

import java.util.HashMap;
import java.util.Scanner;

public class numbers {


    public static void main(String[] args) {
        HashMap<Integer,String> oneD=new HashMap<>();
        oneD.put(1,"one");oneD.put(2,"two");oneD.put(3,"three");oneD.put(4,"four");oneD.put(5,"five");
        oneD.put(6,"six");oneD.put(7,"seven");oneD.put(8,"eight");oneD.put(9,"nine");oneD.put(10,"ten");
        oneD.put(11,"eleven");oneD.put(12,"twelve");oneD.put(13,"thirteen");oneD.put(14,"fourteen");oneD.put(15,"fifteen");
        oneD.put(16,"sixteen");oneD.put(17,"seventeen");oneD.put(18,"eighteen");oneD.put(19,"nineteen");
        oneD.put(20,"twenty");oneD.put(30,"thirty");oneD.put(40,"fourty");oneD.put(50,"fifty");
        oneD.put(60,"sixty");oneD.put(70,"seventy");oneD.put(80,"eighty");oneD.put(90,"ninty");
        HashMap<Integer,String> position=new HashMap<>();
        position.put(2,"hundred");position.put(3,"thousand");position.put(6,"million");position.put(9,"billiion");position.put(12,"trilliion");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int index=0;
        int three=0;
        while(index!=str.length())
        {

            if(index+1 != str.length())
            {
                if(three==2)
                {
                    int b=str.charAt(index-1);
                    int a=str.charAt(index);
                    int num=a*10+b;
                    if(num<20)
                        System.out.println(oneD.get(num));
                    else {
                        System.out.println(oneD.get(a)+oneD.get(b));
                    }

                }
            }
if(three==3)
            {
                System.out.print(oneD.get(str.charAt(index))+"hundred");
                three=0;


            }
            if((index-1)%3==0)
            {
                System.out.println(position.get(index-1));
            }
            index++;
        }

    }
}
