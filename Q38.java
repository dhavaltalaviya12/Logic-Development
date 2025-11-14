public class Q38 {
    public static void main(String[] args) {
        int[] A = { 1, 1, 1, 2, 2 };
        int[] A2 = { 1, 1, 1, 3, 3, 3, 3 };
        int[] A3 = { 3, 2, 2, 2 };

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                System.out.println("0");
            }
        }
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        if (count >= 3) {
            System.out.println("1");
        }
        System.out.println("0");
    }
}
