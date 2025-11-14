import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n : ");
        int n = sc.nextInt();
        // int[]a = new int[32];
        // for(int i=31; i>0;i--){
        // a[i] = n%8;
        // n /=8;
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]);
        // }

        int count = 0;
        double sum = 0;
        while (n != 0) {
            sum = sum + (n % 10) * (Math.pow(8, count));
            n = n / 10;
            count++;
        }
        System.out.println(sum);
    }
}
