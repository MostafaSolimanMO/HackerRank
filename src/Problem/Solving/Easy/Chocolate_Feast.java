package Problem.Solving.Easy;

import java.util.Scanner;

public class Chocolate_Feast {
    private static final Scanner scanner = new Scanner(System.in);

    static int chocolateFeast(int n, int c, int m) {
        int totalCanBuy = n / c;
        int wrappers = totalCanBuy;

        while (wrappers >= m) {
            int exChocs = wrappers / m;
            wrappers = exChocs + wrappers % m;
            totalCanBuy += exChocs;
        }
        return totalCanBuy;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = new Scanner(System.in).nextLine().split(" ");
            int n = Integer.parseInt(ncm[0]);
            int c = Integer.parseInt(ncm[1]);
            int m = Integer.parseInt(ncm[2]);
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
    }
}
