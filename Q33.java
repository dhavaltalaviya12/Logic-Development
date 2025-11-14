import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary String : ");
        String s = sc.nextLine();
        int y;
        int x = -1;
        float sum = 0;

        int dot = s.indexOf('.');

        if (dot == -1) {
            y = s.length() - 1;
            dot = s.length();
        } else {
            y = dot - 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.')
                continue;
            else if (s.charAt(i) == '1' && i < dot) {

                sum += Math.pow(2, y);

            } else if (s.charAt(i) == '1') {

                sum += Math.pow(2, x);
                x--;
            }

            y--;

        }
        System.out.println(sum);
    }
}
