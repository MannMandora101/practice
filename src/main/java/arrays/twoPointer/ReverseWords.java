package arrays.twoPointer;

class ReverseWords {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end;
        for (end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        return new String(chars);
    }

    private void reverse(char[] chars, int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            char temp = chars[startIdx];
            chars[startIdx] = chars[endIdx];
            chars[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }


    public void reverseString(char[] s) {
       int startIdx=0;
       int endIdx=s.length-1;
        while (startIdx < endIdx) {
            char temp = s[startIdx];
            s[startIdx] = s[endIdx];
            s[endIdx] = temp;
            startIdx++;
            endIdx--;
        }

        System.out.println(s);
    }

    public String reverseWords_(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = new StringBuilder(split[i]).reverse().toString();
        }
        return String.join(" ", split);
    }

    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }


    public static void main(String[] args) {
        ReverseWords words = new ReverseWords();
        System.out.println(words.reverseWords("Let's take LeetCode contest"));
        System.out.println(words.reverseWords_("Let's take LeetCode contest"));
        System.out.println(words.reverseStr("LeetCodecontest", 2));
        char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e'};
        words.reverseString(JavaCharArray);
    }
}

