import java.util.*;
public class sumofdiagonal {
    public static void sum(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i==j){
                sum+=matrix[i][j];
            }
            if((i+j) == matrix.length-1){
                sum+=matrix[i][j];
            }
            }

        }
        System.out.println("The sum is "+sum);
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
        sum(matrix);
    }
}
