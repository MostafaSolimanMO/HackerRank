package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Grid_Challenge {
    private static final Scanner scanner = new Scanner(System.in);

    static String gridChallenge(String[] grid) {
        for (int i = 0; i < grid.length; i++) {
            char[] arr = grid[i].toCharArray();
            Arrays.sort(arr);
            grid[i] = new String(arr);
        }
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) > grid[i + 1].charAt(j)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                String gridItem = scanner.nextLine();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);
            System.out.println(result);
        }
        scanner.close();
    }
}
