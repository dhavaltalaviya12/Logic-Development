import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        String str = new String();
        while (n != 0) {
            if (n % 16 == 10) {
                str += "A";
                n /= 16;
            } else if (n % 16 == 11) {
                str += "B";
                n /= 16;

            } else if (n % 16 == 12) {
                str += "C";
                n /= 16;

            } else if (n % 16 == 13) {
                str += "D";
                n /= 16;

            } else if (n % 16 == 14) {
                str += "E";
                n /= 16;

            } else if (n % 16 == 15) {
                str += "F";
                n /= 16;

            } else {
                str = (n % 16) + str + "";
                n /= 16;
            }
        }
        System.out.println("Hexa Decimal Number : " + str);
    }
}
