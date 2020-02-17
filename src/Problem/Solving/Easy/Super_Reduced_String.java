package Problem.Solving.Easy;

import java.util.Scanner;

public class Super_Reduced_String {
    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                s = s.substring(0, i - 1) + s.substring(i + 1);
                i = 0;
            }
        }
        if (!s.isEmpty()) return s;
        return "Empty String";
    }

    public static void main(String[] args) {

        String s = new Scanner(System.in).nextLine();
        String result = superReducedString(s);
        System.out.println(result);

    }
}
