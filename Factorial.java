import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Ans = "+fact);
        System.out.println("Ans = "+fac(6));
    }
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}


