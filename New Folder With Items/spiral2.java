import java.util.*;
public class spiral2 {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int sr=0,sc=0,er=(n-1),ec=(n-1);
        int mat[][]=new int[m][n];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        while(sr<=er && sc<=ec){
            for(int i=sr;i<=ec;i++){
                System.out.print(mat[sr][i]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(mat[i][er]+" ");
            }
            for(int i=ec-1;i>=sc;i--){
                System.out.print(mat[er][i]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(mat[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
}
