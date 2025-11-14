import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        int j = arr.length-1;
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println("-------------------------------");
        System.out.print("Reverse Array : ");
        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
