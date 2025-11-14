import java.util.Scanner;

public class SumOfFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("-------------------------");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum += i; 
            }
        }
        System.out.println("Ans = "+sum);
    }
}
