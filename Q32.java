import java.util.Arrays;

public class Q32 {

    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        String s1 = "dhaval";
        System.out.println("String 1 : " + s1);
        String s2 = "lavahd";
        System.out.println("String 2 : " + s2);

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        bubbleSort(ch1);
        bubbleSort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}