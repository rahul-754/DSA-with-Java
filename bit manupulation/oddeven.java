import java.lang.*;

class oddeven{
    public static void eveneodd(int n){
        int bitmask=1;
        if((n & bitmask )== 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        eveneodd(5);
        System.out.println(5<<2);
        System.out.println(5*(Math.pow(2,2)));
        System.out.println(5>>2);
        System.out.println(5/(Math.pow(2, 2)));
    }
}