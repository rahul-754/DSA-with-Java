import java.util.*;
public class spiralmatrix {
    public static void spiral(int matrix[][]){
        int startrow=0;
        int n=matrix.length;
        int endrow= n-1;
        int startcol=0;
        int endcol=n-1;
        int arr[] = new int[n*n];
        int k=0;
        while(startrow <= endrow && startcol <=endcol){
                //top
                for(int j=startcol;j<=endcol;j++){
                    System.out.print(matrix[startcol][j]+" ");
                    arr[k]=matrix[startcol][j];
                    k++;
                }
                //Right
                for(int j=startrow+1;j<=endrow;j++){
                    System.out.print(matrix[j][endcol]+" ");
                    arr[k]=matrix[j][endcol];
                    k++;
                }
                //buttom
                for(int i=endcol-1;i>=startcol;i--){
                   System.out.print(matrix[endrow][i]+" ");
                    arr[k]=matrix[endrow][i];
                    k++;
                }
                // left
                for(int i=endrow-1;i>startrow;i--){
                   System.out.print(matrix[i][startcol]+" ");
                    arr[k]=matrix[i][startcol];
                    k++;
                }
                startcol++;
                startrow++;
                endcol--;
                endrow--;

        }
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
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
