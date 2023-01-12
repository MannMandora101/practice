package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class WordLadderLength {
    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        Queue<WL> queue = new LinkedList<>();
        queue.add(new WL(startWord, 1));
        Set<String> set = new HashSet<>();
        int len = wordList.length;
        for (int i = 0; i < len; i++) {
            set.add(wordList[i]);
        }
        set.remove(startWord);
        while (!queue.isEmpty()) {
            String word = queue.peek().first;
            int steps = queue.peek().distance;
            queue.remove();
            if (word.equals(targetWord)) {
                return steps;
            }
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedArray = word.toCharArray();
                    replacedArray[i] = ch;
                    String replaceWord = new String(replacedArray);
                    if (set.contains(replaceWord)) {
                        set.remove(replaceWord);
                        queue.add(new WL(replaceWord, steps + 1));
                    }
                }
            }
        }
        return 0;
    }
}

class WL {
    String first;
    int distance;

    public WL(String first, int distance) {
        this.first = first;
        this.distance = distance;
    }
}