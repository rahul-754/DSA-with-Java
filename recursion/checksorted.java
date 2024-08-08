public class checksorted{
    public static boolean check(int a[],int i) {
      if(i==a.length-1){
        return true;
      }
     if(a[i]>a[i+1]){
        return false;
     }
     return check(a,i+1);
}
public static void main(String[] args){
    int arr[]={1,2,3,4,5};
    System.out.println(check(arr, 0));
}
}