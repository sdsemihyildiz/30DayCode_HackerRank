import java.util.Scanner;

public class daytwoOperator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();

        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        int totalCost = (int) Math.round(mealCost + tax + tip);

        System.out.println(totalCost);

    }
}
