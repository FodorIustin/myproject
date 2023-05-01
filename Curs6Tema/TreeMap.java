package Curs6Tema;

import java.util.TreeMap;

public class TreeMap {
    public static TreeMap<String, Integer> countWords(String[] words) {
        TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>;
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
