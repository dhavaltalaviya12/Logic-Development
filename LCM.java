import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("-------------------------");
        int max = a > b ? a : b;
        for (int i = max; i <= (a*b); i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("Ans = "+i);
                break;
            }
        }
    }
}
