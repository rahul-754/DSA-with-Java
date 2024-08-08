import java.util.Scanner;

public class buyandsellstocks {
    public static int stocks(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }
        // System.out.println("The maximum profit is : "+ maxprofit);
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days : ");
        int n = sc.nextInt();
        int price[] = new int[n];
        System.out.print("Enter the prizes of stocks as per the the required date : ");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.print(stocks(price));
    }
}
