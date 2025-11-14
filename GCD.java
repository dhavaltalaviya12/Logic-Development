import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("-------------------------");
        int min = a < b ? a : b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
        }
    }
}
