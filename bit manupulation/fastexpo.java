public class fastexpo {
    public static int fast(int n,int e){
        int ans=1;
        while(e>0){
            if((e&1)!=0){
                ans=ans*n;
            }
            n=n*n;
            e=e>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fast(2, 2));
    }
}
