import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int m1 = arr[0];
        int m2 = arr[1];
        if (m1 < m2) {
            int temp = m1;
            m1 = m2;
            m2 = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m1 || arr[i] == m2)
                continue;
            if (arr[i] > m1) {
                m2 = m1;
                m1 = arr[i];
            } else if (arr[i] > m2) {
                m2 = arr[i];
            }
        }
        m2 = m1 == m2 ? -1 : m2;
        System.out.print("Second Largest Element : " + m2);
    }
}
