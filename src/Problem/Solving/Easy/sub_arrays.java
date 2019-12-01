package Problem.Solving.Easy;

import java.util.Scanner;

public class sub_arrays {
    static int countEvenSum(int arr[], int n) {
        int result = 0;

        // Find sum of all subarrays
        // and increment result if
        // sum is even
        for (int i = 0; i <= n - 1; i++) {
            int sum = 0;
            for (int j = i; j <= n - 1; j++) {
                sum = sum + arr[j];
                if (sum % 2 == 0)
                    result++;
            }
        }

        return (result);
    }

    public static void main(String args[]) throws Exception {
        int n = new Scanner(System.in).nextInt();

        int[] arr = new int[n];
        String[] arrItems = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println(countEvenSum(arr, n));
    }
}



