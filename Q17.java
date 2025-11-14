public class Q17 {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((j == 0 || j == i)) {
                    a[i][j] = 1;
                } else {
                    if ((i > 0 && j > 0) && (j < i)) {

                        a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                    }
                }
            }
            System.out.print("\n");
        }
        int var = n+(n/2)-2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                while(var!=0){
                    System.out.print(" ");
                    var--;
                }
                System.out.print(" "+a[i][j]);
            }
            var = n-i;
            System.out.println("\n");
        }

    }
}
