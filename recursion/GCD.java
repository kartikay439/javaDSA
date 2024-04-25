package recursion;

public class GCD {

    public static void main(String[] args) {
        int x=42,y=56;
        System.out.println(GCD(x,y));



    }
    public static int GCD(int x,int y)
    {
        int tem = x;
x=Math.max(x,y);
y=Math.min(tem,y);
if(x%y==0)return y;
return GCD(x%y,y);
    }
}
