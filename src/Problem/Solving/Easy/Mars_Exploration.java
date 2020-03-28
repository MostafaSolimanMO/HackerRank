package Problem.Solving.Easy;

import java.util.Scanner;

public class Mars_Exploration {
    private static final Scanner scanner = new Scanner(System.in);

    static int marsExploration(String s) {
        String sos = "SOS";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int result = marsExploration(s);
        System.out.println(result);
        scanner.close();
    }
}
