import java.util.Scanner;

public class FindUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter element : ");
            b[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        boolean[] c = new boolean[max+1];
        for (int i : a) {
            c[i] = true;
        }

        for (int i : b) {
            c[i] = true;
        }
        System.out.println("-------------------------------");
        System.out.print("Unique Elements : ");
        for (int i = 0; i < c.length; i++) {
            if (c[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
