import java.io.*;

import java.util.*;

public class Day7 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();

        }
        for (int i = 0; i < n; i++) {
            int index = n - 1 - i;
            System.out.print(array[index] + " ");

        }
        scan.close();

    }
}
