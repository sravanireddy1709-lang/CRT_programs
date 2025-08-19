package cse;
public class smallar {
    public static void main(String[] args) {
        String sentence = "Java  programming language";
        String[] words = sentence.split(" ");
        String smallest = words[0];
        String largest = words[0];
        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }

            if (word.length() > largest.length()) {
                largest = word;
            }
        }
        System.out.println("Sentence: " + sentence);
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }
}

