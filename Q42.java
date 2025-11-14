public class Q42 {
    public static void main(String[] args) {
        int n = 11;
        int count = 9;
        int digit = 1;
        int start = 1;
        while (n > digit * count) {
            n = n - digit * count;
            digit++;
            count *= 10;
            start *= 10;
        }
        int num = start + (n - 1) / digit;
        System.out.println("Number: " + num);

        int index = (n - 1) % digit;
        System.out.println("Index: " + index);

        String s = Integer.toString(num);
        char digitChar = s.charAt(index);
        System.out.println("Digit: " + digitChar);
    }
}
