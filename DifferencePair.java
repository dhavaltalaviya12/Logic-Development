import java.util.Scanner;

public class DifferencePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter gap k : ");
        int k = sc.nextInt();
        System.out.println("------------------------------");
        for (int m = 0; m < 5; m++) {
            for (int n = m + 1; n < 5; n++) {
                if ((arr[m] - arr[n] == k) || (arr[m] - arr[n] == -k)) {
                    System.out.println("Pair of Even Number : {" + arr[m] + "," + arr[n] + "}");
                }
            }
        }
    }
}
