package pcph;

public class palindrome {
    //Function For CHecking PALINDROME
    public static boolean isPalindrome(String str)
    {
        if(str.length()<=1)return true;
        return str.charAt(0)==str.charAt(str.length()-1) && isPalindrome(str.substring(1,str.length()-1));
    }

    public static void main(String[] args) {
      if(isPalindrome("HELLO"))
          System.out.println("YEs");
      else System.out.println("NO");
    }
}
