package Problem.Solving.Easy;

import java.util.Scanner;

public class Divisible_Sum_Pairs {
    private static final Scanner scanner = new Scanner(System.in);

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int number = ar[i] + ar[j];
                if (number % k == 0) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        scanner.close();
    }
}
