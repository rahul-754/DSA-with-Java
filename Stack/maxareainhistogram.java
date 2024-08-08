import java.util.*;
class maxareainhistogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int smallleft[] = new int[n];
        int smallright[] = new int[n];
        Stack<Integer> s = new Stack<>();
       

        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
               int temp= s.pop();
                                System.out.println("Element poped " +temp);

            }
            if(s.isEmpty()){
                smallleft[i] = -1;
                                System.out.println("Element assigned left "+smallleft[i]);

            }
            else{
                smallleft[i] = s.peek();
                                System.out.println("Peek value assigned left"+ smallleft[i]);

            }

            s.push(i);
                        System.out.println("Element pushed "+ i);

        }
        System.out.println("\n\n");
        System.out.println("Left array");
        for(int i =0;i<smallleft.length;i++){
            System.out.print(smallleft[i]+" ");
        }

        s = new Stack<>();
        System.out.println("Right side elements : ");
        System.out.println("\n\n");
        for(int i=heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
               int temp= s.pop();
                System.out.println("Element poped " +temp);
            }
            if(s.isEmpty()){
                smallright[i] = heights.length;
                System.out.println("Element assigned right"+smallright[i]);
            }
            else{
                smallright[i] = s.peek();
                System.out.println("Peek value assigned right"+ smallright[i]);
            }

            s.push(i);
            System.out.println("Element pushed "+ i);
        }
         System.out.println("\n\n");
        System.out.println("Right array");
        for(int i =0;i<smallright.length;i++){
            System.out.print(smallright[i]+" ");
        }
        int largeRectangle = 0;
        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = smallright[i] -smallleft[i]-1;
            int currRectangle = height * width;
            largeRectangle = Math.max(currRectangle, largeRectangle);
        }

        return largeRectangle;


    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println();
        System.out.println(largestRectangleArea(arr));
    }
}