public class Q30 {
    public static boolean isInArray(int a[], int m) {
        int i = 0;
        while (a[i] == 0) {
            i++;
        }
        if (i == a.length) {
            if (a[i] != m) {
                a[i] = 0;
                return isInArray(a, m);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int ele = 6;
        boolean ans=isInArray(arr,ele);
        System.out.println(ans);
    }
}
