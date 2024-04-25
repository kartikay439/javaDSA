import java.util.Scanner;

public class C_411A
{
    public static boolean passwordCheck(String s)
    {
        if(s.length()<5)return false;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isUpperCase(s.charAt(i)))
            {
break;
            }
            if(i==s.length()-1)return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLowerCase(s.charAt(i)))
            {
                break;
            }
            if(i==s.length()-1)return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i)))
            {
                break;
            }
            if(i==s.length()-1)return false;
        }
        return true;

    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        if(passwordCheck(s))
//        System.out.println("Correct");
//        else System.out.println("Too weak");

    }
}
