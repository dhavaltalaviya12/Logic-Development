public class Q44 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ac";
        boolean flag = true;
        int l1 = s1.length();
        int l2 = s2.length();
        int max = (l1 > l2) ? l1 : l2;
        for (int i = 0; i < max; i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(s1 + " is Greater");
                flag = false;
                break;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(s2 + " is Greater");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Both String are equal");
        }
    }
}
