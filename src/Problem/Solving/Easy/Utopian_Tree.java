package Problem.Solving.Easy;

import java.util.Scanner;

public class Utopian_Tree {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        int high = 1;
        for (int i = 1; i <= t; i++) {
            if (i % 2 == 0) {
                high = high + 1;
            } else high = high * 2;
        }
        System.out.println(high);
        scanner.close();
    }
}
