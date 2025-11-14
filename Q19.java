public class Q19 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 1) {
                for (int k = 1; k <= 5; k++) {
                    System.out.print(count++ +"\t");
                }
                

            } else {
                count+=4;
                for (int k = 5; k >= 1; k--) {
                    System.err.print(count-- +"\t");
                }
                count+=6;
            }
            System.out.print("\n");
        }
    }
}
