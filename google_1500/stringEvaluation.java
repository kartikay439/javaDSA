package google_1500;

import java.util.HashMap;
import java.util.Stack;
class StringEvaluation {
    public static void main(String[] args) {
        String str = "3+4+5";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('*',2);
        map.put('/',2);
        map.put('+',1);
        map.put('-',1);
        Stack<Character> st = new Stack<>();
        String postOrder="";
        for (int i = 0; i < str.length(); i++) {
            Character j=str.charAt(i);
            if(map.containsKey(j))
            {
                if(st.isEmpty())
                {
                    st.push(j);
                }
                else
                {
                    if(map.get(j) != null && map.get(j)<=map.get(st.peek())) {
                        while (!st.isEmpty() && map.get(j) <= map.get(st.peek())){
                            postOrder += st.pop();
                        }
                        st.push(j);
                    }
                    else
                    {
                        st.push(j);
                    }
                }
            }
            else
            {
                st.push(j);
            }
        }
        while (!st.isEmpty())
        {
            postOrder+=st.pop();
        }
        System.out.println(postOrder);
    }
}
