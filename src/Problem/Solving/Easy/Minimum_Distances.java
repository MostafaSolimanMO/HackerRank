package Problem.Solving.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Minimum_Distances {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        ArrayList minimumList = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    int distance = Math.abs(i - j);
                    minimumList.add(distance);
                }
            }
        }
        Collections.sort(minimumList);
        int minimumNumber = (int) minimumList.get(0);
        if (minimumList.isEmpty()) return -1;
        return minimumNumber;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] a = new int[n];

        String[] aItems = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);
        System.out.println(result);
        scanner.close();
    }
}
