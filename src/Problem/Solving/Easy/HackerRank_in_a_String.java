package Problem.Solving.Easy;

import java.util.Scanner;

public class HackerRank_in_a_String {
    private static final Scanner scanner = new Scanner(System.in);

    static String hackerrankInString(String s) {
        String str = "hackerrank";
        if (s.length() < str.length()) return "NO";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) j++;
        }
        return (j == str.length() ? "YES" : "NO");
    }

    public static void main(String[] args) {
        int q = new Scanner(System.in).nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
