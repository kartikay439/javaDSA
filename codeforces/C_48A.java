package codeforces;

import java.util.*;

public class C_48A {
    public static String rockPaperScissors(String[] ls)
    {
       if(Objects.equals(ls[0], ls[1]) && Objects.equals(ls[1], ls[2]))
       {
//           System.out.println(1);
           return "?";
       }
       if(!Objects.equals(ls[0], ls[1]) && !Objects.equals(ls[1], ls[2] )&& !Objects.equals(ls[0], ls[2]))
       {
//           System.out.println(2);
           return "?";
       }
       if(Objects.equals(ls[0], ls[1]))
       {
           if(Objects.equals(ls[1], "rock") && Objects.equals(ls[2], "scissors"))return "?";
           else if(Objects.equals(ls[1], "scissors") && Objects.equals(ls[2], "rock"))return "S";
           else if(Objects.equals(ls[1], "scissors") && Objects.equals(ls[2], "paper"))return "?";
           else if(Objects.equals(ls[1], "rock") && Objects.equals(ls[2], "paper"))return "S";
           else if(Objects.equals(ls[1], "paper") && Objects.equals(ls[2], "rock"))return "?";
           else if(Objects.equals(ls[1], "paper") && Objects.equals(ls[2], "scissors"))return "S";
       }
       else if(Objects.equals(ls[1], ls[2]))
       {
           if(Objects.equals(ls[1], "rock") && Objects.equals(ls[0], "scissors"))return "?";
           else if(Objects.equals(ls[1], "scissors") && Objects.equals(ls[0], "rock"))return "F";
           else if(Objects.equals(ls[1], "scissors") && Objects.equals(ls[0], "paper"))return "?";
           else if(Objects.equals(ls[1], "rock") && Objects.equals(ls[0], "paper"))return "F";
           else if(Objects.equals(ls[1], "paper") && Objects.equals(ls[0], "rock"))return "?";
           else if(Objects.equals(ls[1], "paper") && Objects.equals(ls[0], "scissors"))return "F";
       }
       else if(Objects.equals(ls[0], ls[2]))
       {
//           System.out.println("hello");
           if(Objects.equals(ls[2], "rock") && ls[1].equals("scissors"))return "?";
           else if(Objects.equals(ls[2], "scissors") && Objects.equals(ls[1], "rock"))return "M";
           else if(Objects.equals(ls[2], "scissors") && Objects.equals(ls[1], "paper"))return "?";
           else if(Objects.equals(ls[2], "rock") && Objects.equals(ls[1], "paper"))return "M";
           else if(Objects.equals(ls[2], "paper") && Objects.equals(ls[1], "rock"))return "?";
           else if(Objects.equals(ls[2], "paper") && Objects.equals(ls[1], "scissors"))return "M";
       }

return "?";

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ls[]=new  String[3];
        for (int i = 0; i <3 ; i++) {
            ls[i]= sc.nextLine();
        }
//        for(String i:ls) System.out.println(i);
        System.out.println(rockPaperScissors(ls));
    }
}
