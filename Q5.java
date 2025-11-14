import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        double n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (i * (i + 1) == n) {
                System.out.println("Pronic");
                count = 1;
                break;
            }
        }
        if (count == 0) {

            System.out.println("Not Pronic");
        }
    }
}
