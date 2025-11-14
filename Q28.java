public class Q28 {
    public static void main(String[] args) {
        String s = "2a3b";
        StringBuilder numStr = new StringBuilder();
        int i = 0; 

        while (i < s.length()) {
            char countChar = s.charAt(i);
            if (Character.isDigit(countChar)) {
                int count = Character.getNumericValue(countChar); 
                i++; 
                if (i < s.length()) { 
                    char repeatChar = s.charAt(i);
                    for (int j = 0; j < count; j++) {
                        numStr.append(repeatChar);
                    }
                }
            }
            i++; 
        }
        System.out.println(numStr);
    }
}