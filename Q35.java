public class Q35 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 1, 4, 5 };
        int count = 0;
        boolean ans = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                ans = true;
            }
            if (a[i] >= a[i + 1]) {
                count++;
                if (a[i + 1] < a[i - 1]) {
                    ans = false;
                    break;
                } else {
                    i++;
                }

            }
            if (count > 1) {
                ans = false;
                break;

            }
        }
        System.out.println(ans);
    }
}
