package postfix;

import org.w3c.dom.Node;

import java.util.Stack;
import java.util.HashMap;



public class test{

    public static void toPost(String s) {
        StringBuffer postfix=new StringBuffer();
        StringBuffer STA=new StringBuffer();

        Stack<Character> st = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);
        System.out.println("INPUT      "+"STACK      "+"POSTFIX");

        char[] arr = s.toCharArray();


        for (Character i:arr)
        {
//            System.out.println(i);
if(Character.isAlphabetic(i))
{

    postfix.append(i);
//    System.out.println(i);
}
else
{
  while ((!st.isEmpty())  &&  (map.get(i)<=map.get(st.peek())) )
  {
//      System.out.println("POP :"+st.peek());
      STA.deleteCharAt(STA.length()-1);
      postfix.append(st.pop());
  }
//    System.out.println("PUSH :"+i);
STA.append(i+" ");
  st.push(i);

}
            System.out.print(i+"          "+STA);
            for (int j = 0; j <11-STA.length() ; j++) {
                System.out.print(" ");
            }
            System.out.println(postfix);

        }
            while (!st.isEmpty()) {
//                System.out.println("POP: " + st.peek());
                postfix.append(st.pop());
            }
        System.out.println(postfix);
    }
    public static int cal(String str)
    {
        Stack<Integer> st = new Stack<>();
        char[] str1= new char[str.length()];
        System.out.println(str);
        int co =1;
//        System.out.println(str.length());
        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.println();
            str1[str.length()-i-1]=str.charAt(i);
        }

        int value=0;
        int v1=0,v2=0;
//        for(char i :str1) System.out.print(i);
        for (Character i:str1)
        {
//            char i='a';
            if(Character.isDigit(i))
            {
                st.push(i-48);
            }
            else{
                switch (i)
                {

                    case '+':
                        v1=st.pop();
                        v2=st.pop();
                        value=v1+v2;
                        break;
                    case '-':
                        v1=st.pop();
                        v2=st.pop();
                        value=v1-v2;
                        break;
                    case '*':
                        v1=st.pop();
                        v2=st.pop();
                        value=v1*v2;
                        break;
                    case '/':
                        v1=st.pop();
                        v2=st.pop();
                        value=v1/v2;
                        break;
                    case '^':
                        v1=st.pop();
                        v2=st.pop();
                        value= (int) Math.pow(v1,v2);
                        break;
                }
                st.push(value);
            }

        }
        return st.pop();
//        return 5;
    }



    public static void main(String[] args) {

        toPost("a+b");;
    }



}
