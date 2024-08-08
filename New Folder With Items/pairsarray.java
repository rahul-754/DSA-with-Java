import java.util.*;

class pairsarray {
    public static void printpairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        printpairs(numbers);
    }
}