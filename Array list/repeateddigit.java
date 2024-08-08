public class repeateddigit {
    // public static boolean isrepeated(int n){
    //     int temp=n%10,rem=0;
    //     while(n>0){
    //         rem=n%10;
    //         if(rem!=temp)
    //         return false;
    //         n=n/10;
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //    int n1=101,n2=200;
    //     for(int i=n1;i<=n2;i++){
    //         if(isrepeated(i))
    //         continue;
    //         else
    //         System.out.println(i);
    //     }
    // }


    static int find(int n1, int n2) {
        int count = 0;
        for (int i = n1 ; i <= n2 ; i++) {
            int num = i;

            boolean[] visited = new boolean[10];

            while (num > 0) {
                if (visited[num % 10] == true)
                    break;
                visited[num % 10] = true;
                num /= 10;
            }

            if (num == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n1 = 101, n2 = 200;
        System.out.println(find(n1, n2));
    }
}
