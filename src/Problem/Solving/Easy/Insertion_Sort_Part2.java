package Problem.Solving.Easy;

import java.util.Scanner;

public class Insertion_Sort_Part2 {
    private static final Scanner scanner = new Scanner(System.in);

    static void insertionSort2(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int key = arr[i + 1];
                if (j == i + 1)
                    break;
                if (arr[j] > key) {
                    arr[i + 1] = arr[j];
                    arr[j] = key;
                }
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        insertionSort2(n, arr);
        scanner.close();
    }
}
