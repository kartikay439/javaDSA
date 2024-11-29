package recursion;

import java.util.ArrayList;

public class StringPermutation {
    static ArrayList<String> answer = new ArrayList<>();
    static  void permutation(String ans,String s){
        if(s.isEmpty()){
            answer.add(ans);
        }
        for(int i=0;i<s.length();i++){
            permutation(ans+s.charAt(i),s.substring(0,i)+s.substring(i+1));
        }
    }

    public static void main(String[] args) {
        permutation("","abc");
        for(String i:answer){
            System.out.println(i+" ");
        }
    }
}
