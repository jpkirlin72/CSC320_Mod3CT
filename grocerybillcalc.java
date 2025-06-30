import java.util.Scanner;

public class GroceryBillCalc {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter coupon value as a decimal (ex. .10 for 10%)");
        double couponAmount = kbd.nextDouble();

        if (couponAmount > 1.0 || couponAmount <= 0.0) {
            System.out.println("Invalid coupon value. Coupon value set to 10%.");
            couponAmount = 0.10;
        }

        double[] weeklyBills = new double[4];

        System.out.print("Enter grocery bill for week 1: ");
        weeklyBills[0] = kbd.nextDouble();
        System.out.print("Enter grocery bill for week 2: ");
        weeklyBills[1] = kbd.nextDouble();
        System.out.print("Enter grocery bill for week 3: ");
        weeklyBills[2] = kbd.nextDouble();
        System.out.print("Enter grocery bill for week 4: ");
        weeklyBills[3] = kbd.nextDouble();

        double monthlyTotal = weeklyBills[0] + weeklyBills[1] + weeklyBills[2] + weeklyBills[3];
        double weeklyAverage = monthlyTotal / 4;

        double discountedMonthlyTotal = monthlyTotal * (1 - couponAmount);
        double discountedWeeklyAverage = discountedMonthlyTotal / 4;

        System.out.println();
        System.out.println("Results:");
        System.out.println("Monthly Total (before coupon): $" + String.format("%.2f", monthlyTotal));
        System.out.println("Weekly Average (before coupon): $" + String.format("%.2f", weeklyAverage));
        System.out.println("Monthly Total (after coupon): $" + String.format("%.2f", discountedMonthlyTotal));
        System.out.println("Weekly Average (after coupon): $" + String.format("%.2f", discountedWeeklyAverage));

        kbd.close();

    }
}