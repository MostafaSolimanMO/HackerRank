package DaysOfCode;

import java.util.Scanner;

public class Strange_Counter {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long t = scanner.nextLong();
        long val = 3;
        while (t > val) {
            t = t - val;
            val = val * 2;
        }
        System.out.println(val - t + 1);
    }
}
