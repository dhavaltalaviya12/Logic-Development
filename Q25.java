import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Money : ");
        int money = sc.nextInt();
        System.out.print("Enter Price per Chocolate : ");
        int price = sc.nextInt();
        System.out.print("Enter K Wrapper : ");
        int k = sc.nextInt();
        int tc = money / price;
        int w = tc;
        while (w >= k) {
            int nc = w / k;
            tc += nc;
            w = (w % k) + nc;
        }
        System.out.println("Total Chocolate : "+tc);
    }

}
