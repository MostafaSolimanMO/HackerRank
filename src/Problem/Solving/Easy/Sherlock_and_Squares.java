package Problem.Solving.Easy;

import java.util.Scanner;

public class Sherlock_and_Squares {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int start = (int) Math.sqrt(A); //Finds our starting squareInteger
            int end = (int) Math.sqrt(B);   //Finds our ending squareInteger

            int squareIntegers = end - start; //Calculates the squareIntegers between them

            squareIntegers += (Math.pow(start, 2) >= A) ? 1 : 0; //Checks to make sure we didn't forget one when we floored A

            System.out.println(squareIntegers);
        }
    }
}

