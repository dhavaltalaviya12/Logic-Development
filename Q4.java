import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int count = 0;
        int temp=0;
        int var = n;
        while (var != 0) {
            var = var / 10;
            count++;
        }
        temp=count;
        int square = n * n;
        while (n != 0) {
            if (n % 10 != square % 10) {
                System.out.println("not Automorphic Number");
                count--;
                break;
            }
            n /= 10;
            square /= 10;
        }
        if (count == temp) {

            System.out.println(" Automorphic");
        }

    }
}
