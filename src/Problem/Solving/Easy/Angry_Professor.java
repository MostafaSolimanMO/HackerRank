package Problem.Solving.Easy;

import java.util.Scanner;

public class Angry_Professor {
    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) result++;
        }

        if (result >= k) return "NO";
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            int[] a = new int[n];
            String[] aItems = scanner.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        scanner.close();
    }
}
