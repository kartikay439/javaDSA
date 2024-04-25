package google_1500;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class nQueens {
    public static List<List <String>> nQueens(int n)
    {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j <n ; j++){
                board[i][j]='.';
            }
        }
        List <List <String>> res= new ArrayList<List <String>>();
        solve(0,board,res);

return res;
    }
    public static boolean valid(int row,int column,char[][]board)
    {
        int r=row,c=column;
     while (--r>=0 && --c>=0)
     {
         if(board[r][c]=='Q')return false;
     }

        r=row;c=column;
        while (--c>=0)
        {
            if(board[r][c]=='Q')return false;
        }
        r=row;c=column;
        while (--c>=0 && ++r<board.length)
        {
            if(board[r][c]=='Q')return false;
        }
        return true;

    }
    public static List<String> construct(char[][] board)
    {
        List<String > ans=new LinkedList<>();
        for(int i=0;i<board.length;i++)
        {
            ans.add(new String(board[i]));
        }
        return ans;
    }
public static void  solve(int col,char[][] board, List <List <String>> res)
{
if(col==board.length)
{
    res.add(construct(board));
    return;

}
    for (int i = 0; i <board.length ; i++) {
        if(valid(i,col,board))
        {
            board[i][col]='Q';
            solve(col+1,board,res);
            board[i][col]='.';
        }
    }
}

    public static void main(String[] args) {
List<List <String>> ans=nQueens(4);
for(List i:ans)
{
    for(Object j:i)
    {
        System.out.println(j);
    }
    System.out.println();
    System.out.println();
}

    }
}
