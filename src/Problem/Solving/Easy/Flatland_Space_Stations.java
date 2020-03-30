package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Flatland_Space_Stations {
    private static final Scanner scanner = new Scanner(System.in);

    static int flatlandSpaceStations(int n, int[] c) {
        int m = c.length;
        Arrays.sort(c);
        int max = c[0];
        for (int i = 1; i < m; i++)
            max = Math.max(max, (c[i] - c[i - 1]) / 2);
        max = Math.max(max, (n - 1 - c[m - 1]));
        return max;
    }

    public static void main(String[] args) {
        String[] nm = new Scanner(System.in).nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] c = new int[m];
        String[] cItems = scanner.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        scanner.close();
    }
}
