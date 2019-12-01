package DaysOfCode;

public class Day2_Operators {
    public static void main(String[] args) {
        System.out.println(solve(10.25, 17, 5));
    }

    static double solve(double meal_cost,
                        int tip_percent,
                        int tax_percent) {
        int totalPrice;
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        totalPrice = (int) (meal_cost + tip + tax);

        return totalPrice;
    }
}
