package Problem.Solving.Easy;

import java.util.Scanner;

public class Halloween_Sale {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int result = 0;
        while (s >= p) {
            s = s - p;
            result++;
            p = Math.max(m, p - d);
        }
        System.out.println(result);

    }
}
