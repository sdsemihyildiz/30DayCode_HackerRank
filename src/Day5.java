import java.io.*;
import java.util.*;

public class Day5 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);

        }
        scan.close();
    }
}
