import java.util.Scanner;

public class trappingRainwater {
    public static int trappedWateramount(int n,int height[]){
       // int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        int RightMax[]=new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i], RightMax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i], RightMax[i]);
            trappedwater+=waterlevel-height[i];
        }
        System.out.println(trappedwater);
        return trappedwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many blocks do you want : ");
        int n=sc.nextInt();
        int height[] = new int[n];
        System.out.println();
        System.out.print("please Enter the heights of each block : ");
        for(int i =0;i<n;i++){
            height[i]=sc.nextInt();
        }
            trappedWateramount(n,height);
    }
}
