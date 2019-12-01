package Problem.Solving.Easy;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        int x1 = new Scanner(System.in).nextInt();
        int v1 = new Scanner(System.in).nextInt();
        int x2 = new Scanner(System.in).nextInt();
        int v2 = new Scanner(System.in).nextInt();

        while (x1 <= x2) {
            if (x1 == x2) {
                System.out.println("YES");
                System.exit(0);
            }
            x1 += v1;
            x2 += v2;
        }
        System.out.println("NO");
    }
}

