import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (n >= (i * i)) {
                System.out.println("Square root of " + n + " is " + i);
                break;
            }
        }
    }
}
