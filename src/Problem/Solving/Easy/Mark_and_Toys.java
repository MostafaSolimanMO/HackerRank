package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Mark_and_Toys {

    private static final Scanner scanner = new Scanner(System.in);

    static int maximumToys(int[] prices, int k) {
        int res = 0;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            if (k >= prices[i]) {
                k = k - prices[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] nk = new Scanner(System.in).nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        System.out.println(result);
    }
}
