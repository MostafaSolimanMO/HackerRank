package Problem.Solving.Easy;

import java.util.Scanner;

public class Happy_Ladybugs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for (int a0 = 0; a0 < Q; a0++) {
            String b = in.next();
            System.out.println(isHappy(b) ? "YES" : "NO");
        }
    }

    public static boolean isHappy(String s) {
        if (hasUnique(s)) return false;
        if (alreadyHappy(s)) return true;
        return hasSpace(s);
    }

    public static boolean hasUnique(String s) {
        int[] ascii = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '_') ascii[(int) s.charAt(i) - 65]++;
        }
        for (int i = 0; i < 26; i++) {
            if (ascii[i] == 1) return true;
        }
        return false;
    }

    public static boolean alreadyHappy(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            boolean b = s.charAt(i) != s.charAt(i + 1);
            if (i == 0 && b) return false;
            else if (b && s.charAt(i) != s.charAt(i - 1)) return false;
        }
        return true;
    }

    public static boolean hasSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') return true;
        }
        return false;
    }
}
