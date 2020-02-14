package Problem.Solving.Easy;

import java.util.Scanner;

public class Append_and_Delete {
    private static final Scanner scanner = new Scanner(System.in);

    static String appendAndDelete(String s, String t, int k) {
        int result;
        String yes = "Yes";
        String no = "No";
        result = Math.abs(s.length() - t.length());
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) result = result + 2;
        }
        if (result <= k) return yes;

        return no;
    }


    public static void main(String[] args) {

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();

        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        scanner.close();
    }
}
