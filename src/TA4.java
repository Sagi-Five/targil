import java.util.Arrays;
import java.util.Scanner;

public class TA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is: " + factorial(n) + " Setu :)");
    }

        public static int factorial (int n) {
            int multi = 1;
            for (int i = 1; i <= n; i++) {
                multi *= i;
            }
            return multi;
        }
}
