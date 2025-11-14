import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        double count = 0;
        double sum = 0;
        int var = n;
        while (var != 0) {
            var = var / 10;
            count++;
        }
        double square =(int) n * n;
        while (square != 0) {
            sum = (int) sum + square % (int)Math.pow(10, count);
            square = (int) square /(int) Math.pow(10, count);
        }
        if (sum == n) {
            System.out.println("Kaprekar");
        } else {
            System.out.println("Not kaprekar");
        }
    }
}
