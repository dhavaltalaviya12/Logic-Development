import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr.length; n++) {
                if (arr[m] < arr[n]) {
                    int temp = arr[m];
                    arr[m] = arr[n];
                    arr[n] = temp;
                }
            }
        }
        System.out.println("------------------------");
        System.out.print("Diffrence between Second largest and Second smallest : ");
        System.out.print(arr[l-2]-arr[1]);
    }
}
