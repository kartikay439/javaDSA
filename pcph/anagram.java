package pcph;

import java.util.ArrayList;

public class anagram {
    public static boolean isAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())return false;
        ArrayList<Character> arr=new ArrayList<>();

        for (int i = 0; i <str1.length() ; i++) {
            arr.add(str1.charAt(i));
        }
        for (int i = 0; i <str1.length() ; i++) {
            if(!arr.contains(str2.charAt(i)))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("secure","rescue"));
    }
}
