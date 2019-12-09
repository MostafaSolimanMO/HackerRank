package Problem.Solving.Easy;

import java.util.Scanner;

public class Cats_and_a_Mouse {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) < Math.abs(y - z)) return "Cat A";
        else if (Math.abs(x - z) > Math.abs(y - z)) return "Cat B";
        else return "Mouse C";
    }

    public static void main(String[] args) {

        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

        }


        scanner.close();
    }
}
