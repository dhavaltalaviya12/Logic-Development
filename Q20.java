public class Q20 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        int[][] arr = new int[size][size];

        int maxVal = n;

        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
        int top = i;
        int left = j;
        int right = size - 1 - j;
        int bottom = size - 1 - i;
        int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
        arr[i][j] = maxVal - minDist;
        }
        }

        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
}
