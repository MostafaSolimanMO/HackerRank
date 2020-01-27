package Problem.Solving.Medium;

import java.util.Scanner;

public class Forming_a_Magic_Square {
    private static final Scanner scanner = new Scanner(System.in);

    static int formingMagicSquare(int[][] s) {
        // TODO

        return 0;
    }

    public static void main(String[] args) {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        System.out.println(result);
        scanner.close();
    }
}
