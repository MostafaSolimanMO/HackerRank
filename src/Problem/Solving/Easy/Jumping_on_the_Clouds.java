package Problem.Solving.Easy;

import java.util.Scanner;

public class Jumping_on_the_Clouds {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (i < c.length - 2) {
                if (c[i + 2] == 0) {
                    jumps++;
                    i++;
                } else if (c[i + 1] == 0) jumps++;
            } else if (c[i + 1] == 0) jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] c = new int[n];

        String[] cItems = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
        scanner.close();
    }
}
