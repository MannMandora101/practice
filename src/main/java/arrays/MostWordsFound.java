package arrays;

class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int j = 0;
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i] + " : " + sentences[i].split(" ").length);
            int length = sentences[i].split(" ").length;
            if (length > j) {
                j = length;
            }
        }
        return j;
    }

    public int mostWordsFound_(String[] sentences) {
        int j = 0;
        for (String sentence : sentences) {
            j = Math.max(sentence.split(" ").length, j);
        }
        return j;
    }


    public static void main(String a[]) {
        MostWordsFound mostWordsFound = new MostWordsFound();
        System.out.println(mostWordsFound.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));

        System.out.println(mostWordsFound.mostWordsFound_(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
}