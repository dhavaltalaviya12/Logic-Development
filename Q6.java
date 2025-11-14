import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int num = happyNum(n);
        if (num == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy");
        }
    }

    public static int happyNum(int n) {
        if (n == 1)
            return 1;
        if (n == 4)
            return 0;

        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n /= 10;
        }
        return happyNum(sum);
    }
}