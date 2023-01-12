package arrays;

class LongestPalindrome {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return s;
        }
        int max = 0;
        String total = "";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String st = s.substring(i, j);
                String reverse = new StringBuilder(st).reverse().toString();
                if (st.equals(reverse)) {
                    if (max < s.substring(i, j).length()) {
                        max = s.substring(i, j).length();
                        total = s.substring(i, j);
                    }
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));
    }
}