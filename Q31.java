public class Q31 {
    public static void main(String[] args) {

        String s = "dhaval";
        char[] ch = new char[s.length()];
        char[] charArray = s.toCharArray();
        int i = 0, count = 0;
        for (char c : charArray) {
            ch[i] = c;
            int temp = i;
            while (temp != 0) {
                if (c == ch[temp-1]) {
                    System.out.println(ch[temp-1]);
                    count++;
                    break;
                }
                temp--;
            }
            i++;
            if (count != 0) {
                break;
            }
        }
    }
}
