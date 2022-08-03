import java.util.*;

public class Day8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int phone = scan.nextInt();
            map1.put(name, phone);
        }
        while (scan.hasNext()) {
            String s = scan.next();
            if (map1.get(s) != null)
                System.out.println(s + "=" + map1.get(s));
            else
                System.out.println("Not found");
        }
        scan.close();
    }
}