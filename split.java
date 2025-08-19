package cse;
import java.util.HashMap;
import java.util.Map;
public class split {
    public static void countWordFrequency(String sentence) {
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("\\s+"); 
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";
        countWordFrequency(sentence);
    }
}

