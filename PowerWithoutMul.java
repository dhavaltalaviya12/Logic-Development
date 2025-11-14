import java.util.Scanner;

public class PowerWithoutMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int sum = a;
        int inc = a;
        for (int i = 1; i < b; i++) {
            for (int j = 1; j < a; j++) {
                sum = sum + inc;
            }
            inc = sum;
        }
        System.out.print("Ans = " + sum);
    }
}
