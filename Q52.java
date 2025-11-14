public class Q52 {
    public static void main(String[] args) {
        String s = "aabbaabb";
        String newStr = s + s;
        if (newStr.substring(1, newStr.length() - 1).contains(s)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
