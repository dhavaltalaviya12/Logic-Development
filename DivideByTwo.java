import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("Range between "+a+" and "+b+" : ");
        for(int i=a; i<=b; i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
        }
    }
}
