import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=b; i++){
            ans += a;
        }
        System.out.println("Ans = "+ans);
    }
}
