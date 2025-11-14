import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        int[][] b = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Enter element : ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------------------------------");
        int[][] c = new int[n][y];
        if (m == x) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < m ; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Matrix Multiplication not possible");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
