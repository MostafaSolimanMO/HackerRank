package Problem.Solving.Easy;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        System.out.println("Enter the number of element in your array");
        Scanner scanner = new Scanner(System.in);
        int numberOfElement = scanner.nextInt();
        String sa = scanner.next();
        int[] array = new int[numberOfElement];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element number " + (i + 1) + " :");
            scanner = new Scanner(System.in);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum(array));
    }

    public static int sum(int[] elements) {
        int sumOf = 0;
        for (int i = 0; i < elements.length; i++) {
            sumOf = elements[i] + sumOf;
        }
        return sumOf;
    }
}
