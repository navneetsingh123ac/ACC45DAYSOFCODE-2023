import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// number of test case

        for (int i = 1; i <= t; i++) {
            int x = sc.nextInt();// number of student in class
            int y = sc.nextInt();// number of seats in class
            if (x > y) {
                System.out.println(x - y);
            } else {
                System.out.println("0");
            }

        }
    }
}
