package Java;

import java.util.Scanner;

public class Java_EndOfFile {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String line;
        int lines = 0;
        try {
            while (true) {
                line = scanner.nextLine();
                if (line == null)
                    return;
                if (lines > 0)
                    System.out.println();
                System.out.print((lines + 1) + " " + line);
                lines++;
            }
        } catch (Exception e) {
        }
    }
}
