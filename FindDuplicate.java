import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int k = 0; k < arr.length; k++) {
            System.out.print("Enter element : ");
            arr[k] = sc.nextInt();
        }
        int large = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        int[] a = new int[large];
        for (int k = 0; k < large; k++) {
            a[k] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            a[arr[i] - 1]++;
        }
        for (int j = 0; j < large; j++) {
            if (a[j] >= 1) {
                System.out.println(j + 1 + " : " + a[j]);
            }
        }
    }
}
