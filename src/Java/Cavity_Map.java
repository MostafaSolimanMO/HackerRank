package Java;

import java.util.Scanner;

public class Cavity_Map {

    private static final Scanner scanner = new Scanner(System.in);

    static String[] cavityMap(String[] grid) {
        for (int i = 1; i < grid.length - 1; i++) {
            int theCavity;
            for (int k = 1; k < grid[i].length() - 1; k++) {
                boolean isExists = grid[i].contains("X");
                if (!isExists) {
                    int number = Integer.parseInt(String.valueOf(grid[i].charAt(k)));
                    if (number > Integer.parseInt(String.valueOf(grid[i].charAt(k + 1))) && number > Integer.parseInt(String.valueOf(grid[i].charAt(k - 1)))) {
                        theCavity = number;
                        if (theCavity > Integer.parseInt(String.valueOf(grid[i - 1].charAt(grid.length - 2)))) {
                            if (theCavity > Integer.parseInt(String.valueOf(grid[i + 1].charAt(1)))) {
                                char[] chars = grid[i].toCharArray();
                                chars[k] = 'X';
                                grid[i] = String.copyValueOf(chars);
                            }
                        }
                    }
                }
            }

        }
        return grid;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = new Scanner(System.in).nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scanner.close();
    }
}
