package Problem.Solving.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Cut_the_sticks {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        Arrays.sort(arr);
        int min = arr[0];

        for (int i = 0; i < n; ) {
            if (n > i)
                System.out.println(arr.length - i);
            else break;
            if (n > i + 1) i++;
            else break;

            while (arr[i] == min) {
                if (n > i + 1) i++;
                else break;
            }
            if (n > i )
                min = arr[i];
            else break;
        }
        scanner.close();
    }
}

