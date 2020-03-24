package Problem.Solving.Easy;

import java.util.Scanner;

public class String_Construction {
    private static final Scanner scanner = new Scanner(System.in);

    static int stringConstruction(String s) {
        return (int) s.chars().distinct().count();
    }

    public static void main(String[] args) {
        int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
