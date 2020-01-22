package Problem.Solving.Easy;

import java.util.Scanner;

public class Library_Fine {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        //Shit I know D:
        int fine = 0;
        if (y1 < y2) return fine;
        if (y1 == y2 && m1 < m2) return fine;
        if (y1 == y2 && m1 == m2 && d1 < d2) return fine;
        if (y1 == y2 && m1 == m2 && d1 == d2) return fine;
        else {
            if (y1 == y2) {
                if (m1 == m2) fine = 15 * (d1 - d2);
                if (m1 != m2) fine = 500 * (m1 - m2);
            } else fine = 10000;
        }
        return fine;
    }

    public static void main(String[] args) {

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);


        scanner.close();
    }
}
