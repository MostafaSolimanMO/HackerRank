package Problem.Solving.Easy;

import java.util.Scanner;

public class Beautiful_Triplets {

    private static final Scanner scanner = new Scanner(System.in);

    static int beautifulTriplets(int d, int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] - arr[j] == d) res++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] nd = new Scanner(System.in).nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        scanner.close();
    }
}
