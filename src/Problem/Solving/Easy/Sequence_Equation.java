package Problem.Solving.Easy;

import java.util.Scanner;

public class Sequence_Equation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] p = new int[n + 1];

        for (int x = 1; x <= n; x++) {
            int px = scanner.nextInt();
            p[px] = x;
        }

        for (int x = 1; x <= n; x++) {
            int y = p[p[x]];
            System.out.println(y);
        }

    }
}
