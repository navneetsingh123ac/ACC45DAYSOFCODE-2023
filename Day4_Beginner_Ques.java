import java.util.*;

public class Day4_Beginner_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// number of test case
        int b;// variable for calculation
        for (int i = 1; i <= t; i++) {
            int x = sc.nextInt();// daily target
            int y = sc.nextInt();// daily sell
            if (x > y) {
                System.out.println(y);
            } else {
                b = ((y - x) * 2) + x;
                System.out.println(b);
            }
        }
    }
}