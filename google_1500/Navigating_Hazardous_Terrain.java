package google_1500;

import java.util.*;

public class Navigating_Hazardous_Terrain {
    public static void make_flood(List<int[]> flood,char board[][])
    {
        int n=flood.size();
        int i=0;
//        System.out.println(flood);
        while(i<n)
        {

            int row=flood.get(i)[0];
            int column= flood.get(i)[1];
            if((row+1) != board.length && board[row+1][column]!='D' && board[row+1][column]!='X')
            {
                board[row+1][column]='*';
                flood.add(new int[]{row+1,column});

            }
            if((row-1)>=0   && board[row-1][column]!='D' && board[row-1][column]!='X')
            {
                board[row-1][column]='*';
                flood.add(new int[]{row-1,column});

            }
            if((column+1) != board[0].length && board[row][column+1]!='D' && board[row][column+1]!='X')
            {
                board[row][column+1]='*';
                flood.add(new int[]{row,column+1});

            }
            if((column-1) >=0 && board[row][column-1]!='D' && board[row][column-1]!='X' )
            {
                board[row][column-1]='*';
                flood.add(new int[]{row,column-1});
            }
            i++;
        }
    }
public static void solve(int step,int r,int c,char[][] board,List<int[]> flood,List<Integer> steps)
{
    System.out.println("r "+r+"c "+c);
    System.out.println(steps);
    for (int i = 0; i <board.length ; i++) {
        for (int j = 0; j <board[0].length ; j++) {
            System.out.print(board[i][j]+"  ");
        }
        System.out.println();

    }
    System.out.println();
    System.out.println();
    System.out.println();

   if(board[r][c]=='D')
    {
//        System.out.println("ook");
        steps.add(step);
        return;
    }

    char[][] sBoard=board;
    List<int[]>sflood=flood;
    int rr=r;
    int cc=c;
    make_flood(sflood,sBoard);


    if(rr>0 && sBoard[rr-1][cc] != '*' && sBoard[rr-1][cc] !='X' && sBoard[rr-1][cc] !='V')
    {
        step++;
//        System.out.println("sBoard Length"+sBoard.length);
        if(sBoard[rr-1][cc]!='D')
        sBoard[rr-1][cc]='S';
        sBoard[rr][cc]='V';

        solve(step,rr-1,cc,sBoard,sflood,steps);
        if(sBoard[rr-1][cc]!='D')

        sBoard[rr-1][cc]='.';

        sBoard[rr][cc]='S';
        step--;




    }
    if( rr<sBoard.length-1 &&  sBoard[rr+1][cc] != '*' && sBoard[rr+1][cc] !='X' && sBoard[rr+1][cc] !='V')
    {

        step++;
        if(sBoard[rr+1][cc]!='D')
            sBoard[rr+1][cc]='S';
        sBoard[rr][cc]='V';

//        System.out.println("sBoard Length"+sBoard.length);
        solve(step,rr+1,cc,sBoard,sflood,steps);
        if(sBoard[rr+1][cc]!='D')

            sBoard[rr+1][cc]='.';

        sBoard[rr][cc]='S';
        step--;



    }
    if(cc>0 && sBoard[rr][cc-1] != '*' && sBoard[rr][cc-1] !='X' && sBoard[rr][cc-1] !='V')
    {

        step++;
        if(sBoard[rr][cc-1]!='D')
        sBoard[rr][cc-1]='S';
        sBoard[rr][cc]='V';

        solve(step,rr,cc-1,sBoard,sflood,steps);
        if(sBoard[rr][cc+1]!='D')

        sBoard[rr][cc-1]='.';

        sBoard[rr][cc]='S';
        step--;



    }

   if( cc<board[0].length-1 && sBoard[rr][cc+1] != '*' && sBoard[rr][cc+1] !='X' && sBoard[rr][cc+1] !='V' )
    {

        step++;
        if(sBoard[rr][cc+1]!='D')
        sBoard[rr][cc+1]='S';
        sBoard[rr][cc]='V';

        solve(step,rr,cc+1,sBoard,sflood,steps);
        if(sBoard[rr][cc+1]!='D')

        sBoard[rr][cc+1]='.';

        sBoard[rr][cc]='S';



    }





}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        List<int[]> flood=new ArrayList<>();
        char[][] input=new  char[row][column];
        int dA=0;int dB=0;int sA=0;int sB=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                char x=sc.next().charAt(0);
                if(x=='D')
                {
                    dA=i;dB=j;
                } else if (x=='S') {
                    sA=i;sB=j;
                } else if (x=='*') {
                    List<Integer> temp=new ArrayList<>();
//                    System.out.println("FLood");
                    flood.add(new int[]{i,j});
                }
                input[i][j]=x;
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
//        for(int[] i:flood)
//        {
//            System.out.println(i[0]+" "+i[1]);
//        }
        List<Integer> steps=new LinkedList<>();
        int step=0;
//        System.out.println(sA+" "+sB+"  Row size"+input.length);
        solve(step,sA,sB,input,flood,steps);
        if(!steps.isEmpty())
        System.out.println(Collections.min(steps));
        else
            System.out.println(-1);
    }




}
