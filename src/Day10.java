import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sumNum = 0, max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sumNum++;
                if (sumNum > max) {
                    max = sumNum;
                }
            } else {
                sumNum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);
    }
}
