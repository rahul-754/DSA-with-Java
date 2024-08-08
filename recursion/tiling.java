public class tiling {
    public static int til(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=til(n-1);
        int fnm2=til(n-2);
        int total=fnm1+fnm2;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(til(4));
    }
}
