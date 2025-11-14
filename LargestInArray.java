import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int []a= {5,10,2,12,6,8,14};
        int []arr = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        for(int i=0; i<=arr.length - 1; i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        System.out.print("Largest element is : "+large);
    }
}
