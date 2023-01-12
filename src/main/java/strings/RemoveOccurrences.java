package strings;

/*
  @created 05/10/22
  @author  manish.mandora


  Input: s = "daabcbaabcbc", part = "abc"
Output: "dab"
Explanation: The following operations are done:
- s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
- s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
- s = "dababc", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".
*/

public class RemoveOccurrences {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int idx = s.indexOf(part);
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        return s;
    }

    public String removeOccurrences_(String s, String part) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            if (builder.length() >= part.length()) {
                if (builder.substring(builder.length() - part.length()).equals(part)) {
                    builder.setLength(builder.length() - part.length());
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        RemoveOccurrences occurrences = new RemoveOccurrences();
        System.out.println("approach -1 : " + occurrences.removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println( "approach -2 : " + occurrences.removeOccurrences_("daabcbaabcbc", "abc"));
    }
}
