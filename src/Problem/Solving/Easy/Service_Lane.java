package Problem.Solving.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Service_Lane {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nt = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nt[0]);
        int t = Integer.parseInt(nt[1]);
        int[] array = new int[n];
        String[] widthItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            array[i] = widthItem;
        }

        ArrayList result = new ArrayList();
        for (int x = 0; x < t; x++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            int Start = Integer.parseInt(casesRowItems[0]);
            int End = Integer.parseInt(casesRowItems[1]);
            // Main Solution
            ArrayList z = new ArrayList();
            for (int i = Start; i <= End; i++) {
                z.add(array[i]);
            }
            Collections.sort(z);
            int minIndex = (int) z.get(0);
            result.add(minIndex);

        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        scanner.close();
    }
}

