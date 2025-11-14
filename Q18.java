import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter element : ");
            b[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k++] = a[i];
                    break;
                }
            }
        }
        System.out.println("-------------------------------");
        System.out.print("Common Elements : ");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
