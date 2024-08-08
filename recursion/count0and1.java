import java.util.ArrayList;
import java.util.Scanner;

public class count0and1 {
    public static void generateSubsequences(int idx, int zeros, int ones, String str, StringBuilder currentSubsequence) {
        if (idx == str.length()) {
            if (zeros == ones) {
                System.out.println(currentSubsequence.toString());
            }
            return;
        }
        
        // Exclude the current character
        generateSubsequences(idx + 1, zeros, ones, str, currentSubsequence);
        
        // Include the current character
        currentSubsequence.append(str.charAt(idx));
        if (str.charAt(idx) == '0') {
            generateSubsequences(idx + 1, zeros + 1, ones, str, currentSubsequence);
        } else {
            generateSubsequences(idx + 1, zeros, ones + 1, str, currentSubsequence);
        }
        currentSubsequence.deleteCharAt(currentSubsequence.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string consisting of 0s and 1s: ");
        String input = sc.nextLine();
        
        StringBuilder currentSubsequence = new StringBuilder();
        generateSubsequences(0, 0, 0, input, currentSubsequence);
    }
}
