import java.util.*;
class star{

    public static int factorial(int number){
       int i,fact=1;  
 // int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    

  System.out.println("Factorial of "+number+" is: "+fact);   
  return fact; 
 }  
 
    public static void main(String args[]){
        factorial(5);
    }
}
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the no of rows : ");
    //     int n=sc.nextInt();
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
