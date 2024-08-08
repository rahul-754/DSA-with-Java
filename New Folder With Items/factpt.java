import java.util.*;
public class factpt {
    public static int fact(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=1;i<=n;i++){
                    ArrayList<Integer>al1=new ArrayList<>();
            for(int j=1;j<=i;j++){
                  al1.add((fact(i-1,j-1)));
            }
             al.add(al1); 
        }       
        System.out.println(al);
    }
}
