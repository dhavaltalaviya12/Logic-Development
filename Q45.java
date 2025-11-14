import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a = { 18, 43, 36, 13, 7 };
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        int result = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] != a[j] && sumOfDigit(a[i]) == sumOfDigit(a[j])) {
                    if (result < (a[i] + a[j])) {
                        result = a[i] + a[j];
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static int sumOfDigit(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}
