import java.util.Scanner;

public class grocerybillcalc {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter coupon value (ex. .10 for 10%)");
        double couponAmount = kbd.nextDouble();
        System.out.println("The coupon value entered is: " + couponAmount);

    }
}