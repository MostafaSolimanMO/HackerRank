package Problem.Solving.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class Organizing_Containers_of_Balls {
    private static final Scanner scanner = new Scanner(System.in);

    static String organizingContainers(int[][] container) {
        String Possible = "Possible";
        String Impossible = "Impossible";
        ArrayList row = new ArrayList();
        ArrayList col = new ArrayList();
        for (int i = 0; i < container.length; i++) {
            int rows = 0;
            int cols = 0;
            for (int j = 0; j < container.length; j++) {
                rows += container[j][i];
                cols += container[i][j];
            }
            row.add(rows);
            col.add(cols);
        }
        row.removeAll(col);
        if (row.isEmpty()) return Possible;
        else return Impossible;
    }

    public static void main(String[] args) {
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {

            int n = scanner.nextInt();

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {

                String[] containerRowItems = new Scanner(System.in).nextLine().split(" ");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);
            System.out.print(result);
        }
        scanner.close();
    }
}
