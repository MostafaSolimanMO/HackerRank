package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Perimeter_Triangle {
    private static final Scanner scanner = new Scanner(System.in);

    static int[] maximumPerimeterTriangle(int[] sticks) {
        int[] res = new int[3];
        Arrays.sort(sticks);
        for (int i = 0; i < sticks.length - 2; i++) {
            for (int j = i + 2; j < sticks.length; j++) {
                if (sticks[i] + sticks[i + 1] > sticks[j]) {
                    res[0] = sticks[i];
                    res[1] = sticks[i + 1];
                    res[2] = sticks[j];
                } else break;
            }
        }
        if (res[0] == 0) return new int[]{-1};
        return res;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] sticks = new int[n];
        String[] sticksItems = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksItems[i]);
            sticks[i] = sticksItem;
        }
        int[] result = maximumPerimeterTriangle(sticks);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            if (i != result.length - 1) System.out.println(" ");
        }
        System.out.println();
        scanner.close();
    }
}
