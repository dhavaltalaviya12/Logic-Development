import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour(1 to 12) : ");
        double h = sc.nextInt();
        System.out.print("Enter Minute : ");
        double m = sc.nextInt();
        if (h == 12) {
            h = 0;
        }
        double minuteAngle = 6 * m;
        double hourAngle = (30 * h) + ((1.0 / 2) * m);
        double angle = hourAngle - minuteAngle;
        System.out.println(angle);
    }
}
