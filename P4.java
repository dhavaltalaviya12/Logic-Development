public class P4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            int p=i;
            for (int j = 1; j <= 4; j++) {
                if (j > n - i) {
                    System.out.print(p);
                    p--;
                } else {
                    System.out.print(" ");
                }
            }
            int q=p+1;
            for (int j = 3; j >= 1; j--) {
                if (j > n - i) {
                    q++;
                    System.out.print(q);

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
