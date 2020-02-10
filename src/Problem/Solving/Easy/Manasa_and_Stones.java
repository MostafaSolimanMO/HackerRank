package Problem.Solving.Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class Manasa_and_Stones {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = scanner.nextInt();

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            TreeSet<Integer> result = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                int sum = (i * a) + ((n - 1 - i) * b);
                result.add(sum);
            }
            for (Integer res : result) {
                System.out.print(res + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
