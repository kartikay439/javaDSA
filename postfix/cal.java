package postfix;

import java.util.Stack;

public class cal {

    public static int cal(String str)
    {
        Stack<Integer> st = new Stack<>();
        char[] str1= new char[str.length()];
        str1=str.toCharArray();
        int value=0;
        int v1=0,v2=0;
        for (Character i:str1)
        {
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
                        value=v2+v1;
                    case '-':
                        v1=st.pop();
                        v2=st.pop();
                        value=v2-v1;
                        break;
                    case '*':
                        v1=st.pop();
                        v2=st.pop();
                        value=v2*v1;
                        break;
                    case '/':
                        v1=st.pop();
                        v2=st.pop();
                        value=v2/v1;
                        break;
                    case '^':
                        v1=st.pop();
                        v2=st.pop();
                        value= (int) Math.pow(v2,v1);
                        break;
                }
                st.push(value);
            }

        }
        return st.pop();
    }
}
