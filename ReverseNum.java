import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int ans = 0;
        while(n!=0){
            ans = n % 10; 
            System.out.print(ans);
            n /= 10;
        }
    }
}
