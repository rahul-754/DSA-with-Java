public class poweroftwo {
    public static boolean Ispoweroftwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(Ispoweroftwo(9));
    }
}
