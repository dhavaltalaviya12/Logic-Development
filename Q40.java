import java.util.Arrays;
import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter element : ");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        int l = c.length;
        int median = 0;
        if (l % 2 == 0) {
            median = (c[l / 2] + c[(l / 2) - 1]) / 2;
        } else {
            median = c[l / 2] / 2;
        }
        System.out.println();
        System.out.println("Median : " + median);
    }
}
