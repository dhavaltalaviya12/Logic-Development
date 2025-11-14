import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        while (k != 0) {
            int prev = a[0];
            for (int i = 1; i < a.length; i++) {
                int next = a[i];
                a[i] = prev;
                prev = next;
            }
            a[0] = prev;
            k--;
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
