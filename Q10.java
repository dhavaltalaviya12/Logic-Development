import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        a[5]=0;
        System.out.println("-------------------------------");
        System.out.print("Enter specific index : ");
        int index = sc.nextInt();
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int prev = a[index];
        for (int i = index; i < a.length; i++) {
            int next = a[i];
            a[i] = prev;
            prev= next;
        }
        a[index]=num;
        System.out.println("-------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
