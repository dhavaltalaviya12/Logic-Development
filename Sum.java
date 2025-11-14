import java.util.*;
public class Sum{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=1; i<=5; i++){
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
             sum = sum + n;
        }
        System.out.println("Ans = "+sum);
    }
}