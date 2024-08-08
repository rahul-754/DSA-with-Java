public class nqueens {
    public static boolean issafe(char board[][],int row,int col){
        //check vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqns(char board[][],int row){
        //base case
        if(row == board.length){
            printboard(board);
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            if(issafe(board, row, j)==true){
            board[row][j]='Q';
            nqns(board, row+1);
            board[row][j]='X';
        }
    }
    }
    public static void printboard(char board[][]){
        System.out.println("-------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqns(board,0);
    }
}
