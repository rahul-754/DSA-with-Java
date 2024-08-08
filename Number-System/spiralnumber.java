import java.util.*;
public class spiralnumber {
    public static void spiral(int matrix[][]){
        int startrow=0;
        int n=matrix.length;
        int endrow= n-1;
        int startcol=0;
        int endcol=n-1;
        while(startrow <= endrow && startcol <=endcol){
                //top
                for(int j=startcol;j<=endcol;j++){
                    System.out.print(n+" ");
                }
                //Right
                for(int j=startrow+1;j<=endrow;j++){
                    System.out.print(n+" ");
                }
                //buttom
                for(int i=endcol-1;i>=startcol;i--){
                    System.out.print(n+" ");
                }
                startcol++;
                startrow++;
                endcol--;
                endrow--;
                n--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        spiral(matrix);
    }
}
