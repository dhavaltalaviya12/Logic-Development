class Q39 {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ')
            i++;
        if (i == n)
            return 0;
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * num);
    }

    public static void main(String[] args) {
        int ans = myAtoi(" -042");
        if (ans < -231) {
            ans = -231;
        } else if (ans > 230) {
            ans = 230;
        }
        System.out.println(ans);
    }
}
