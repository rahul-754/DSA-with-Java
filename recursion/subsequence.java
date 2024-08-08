import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {
  
    public static int substr(int idx, ArrayList<Character> ar, char arr[], int n, int count) {
        if (idx == n) {
            if (isequal(ar)) {
               count++;
            }
            return count;
        }
        ar.add(arr[idx]);
       
        count = substr(idx + 1, ar, arr, n, count);
        ar.remove(ar.size() - 1);
        
        count = substr(idx + 1, ar, arr, n, count);
        
        return count;
    }
    
    public static boolean isequal(ArrayList<Character> ar) {
        int count = 0;
        int count1 = 0;
        for (char i : ar) {
            if (i == '1')
                count++;
            else if (i == '0') {
                count1++;
            }
        }
        return count == count1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        ArrayList<Character> ar = new ArrayList<>();
        int c = 0;

        c = substr(0, ar, arr, n, c);

        System.out.println(c);
    }
}
