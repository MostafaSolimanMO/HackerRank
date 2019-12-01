package Problem.Solving.Easy;

import java.util.Scanner;

public class Two_Strings {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String res = "NO";
        int s1L = s1.length();
        int s2L = s2.length();
        for (int i = 0; i < s1L; i++) {
            for (int j = 0; j < s2L; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    res = "YES";
                    return res;
                }
            }
            return res;
        }
        return res;

    }

    public static void main(String[] args) {

        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        scanner.close();
    }
}
