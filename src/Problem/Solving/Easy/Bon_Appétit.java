package Problem.Solving.Easy;


import java.util.Scanner;

public class Bon_Appétit {

    private static final Scanner scanner = new Scanner(System.in);

    static void bonAppetit(int[] bill, int k, int b) {
        int tolalCost = 0;
        for (int i = 0; i < bill.length; i++) {
            tolalCost = tolalCost + bill[i];
        }
        int actCost = (tolalCost - bill[k]) / 2;
        if (b == actCost) {
            System.out.println("Bon Appetit");
        } else System.out.println(b - actCost);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] bill = new int[n];
        int k = scanner.nextInt();
        for (int i = 0; i < bill.length; i++) {
            bill[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        bonAppetit(bill, k, b);
    }
}


