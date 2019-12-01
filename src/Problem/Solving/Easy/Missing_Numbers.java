package Problem.Solving.Easy;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Missing_Numbers {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        String[] arrScan = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(arrScan[i]);
            arr[i] = x;
        }
        int m = scanner.nextInt();
        int[] brr = new int[n];
        String[] brrScan = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(brrScan[i]);
            brr[i] = x;
        }
        sort(arr);
        sort(brr);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] != arr[i]) {
                result.add(brr[i]);
            } else result.add(brr[i]);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

    }
}
