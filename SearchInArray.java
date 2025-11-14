import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int []a= {5,10,2,12,6,8,14};
        int []arr = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int x = 12;
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (x == arr[i]) {
                System.out.println("Element found in index " + i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Not found");
        }
    }
}
