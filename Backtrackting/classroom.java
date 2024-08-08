import java.util.*;

public class classroom{
    public static int count=0;
    public static void nQueen(char board[][],int row){
        if(row==board.length){
            count++;
            printboard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
        
            nQueen(board,row+1);
            board[row][j]='.';
            }
        }
        
    }
    public static boolean issafe(char board[][], int row, int col){
       for(int i = row-1;i>=0;i--){
           if(board[i][col]=='Q')
           return false;
       }
        return true;
    }
    public static void printboard(char board [][]){
        System.out.println();
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(board,0);
        System.out.println(count);
    }
}