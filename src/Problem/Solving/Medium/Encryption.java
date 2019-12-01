package Problem.Solving.Medium;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Double a = Math.sqrt(s.length());
        int c = (int) Math.ceil(a);

        char ar[] = s.toCharArray();

        for (int i = 0; i < c; i++) {
            int j = i;
            while (j < s.length()) {
                System.out.print(ar[j]);
                j += c;
            }
            System.out.print(" ");
        }
    }
}

