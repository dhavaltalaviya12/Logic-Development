import java.util.Scanner;

public class UniquePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = sc.nextInt();
        int[] primeNum = new int[n];

        int count = 0;
        int p = 0;
        for (int k = 2; k <= n; k++) {
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                primeNum[p] = k;
                p++;
            }
            count = 0;
        }
        for (int i = 0; i < p; i++) {
            System.out.print(primeNum[i] + " ");
        }

        for (int x = 0; x < p; x++) {
            for (int y = x + 1; y < p; y++) {
                if ((primeNum[x] + primeNum[y]) % 2 == 0) {
                    System.out.print("Pair of Even Prime : { " + primeNum[x] + " , " + primeNum[y] + " }");
                }
                System.out.println("\n");
            }
        }
    }
}
