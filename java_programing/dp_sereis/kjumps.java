import java.util.*;

public class kjumps {
    public static int count(int idx, int height[], int k, int min) {
        if (idx == 0)
            return 0;

        min = Integer.MAX_VALUE; // Reset min for each index
        for (int i = 1; i <= k && idx - i >= 0; i++) { // Check idx - i >= 0 to ensure we don't go out of bounds
            int s = count(idx - i, height, k, min) + Math.abs(height[idx] - height[idx - i]);
            min = Math.min(s, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10 };
        int min = Integer.MAX_VALUE;
        System.out.println(count(arr.length - 1, arr, 2, min)); // Start from the last index
    }
}
