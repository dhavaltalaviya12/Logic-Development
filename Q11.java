import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("----------------------------------");
        for (int i = 1; i <= n; i++) {
            temp = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp + n - j;

            }
            System.out.print("\n");
        }
    }
}
