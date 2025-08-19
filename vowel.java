package cse;
import java.util.*;
public class vowel{
	    public static int countVowels(String word) {
	        word = word.toLowerCase();
	        int count = 0;
	        
	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }
	        
	        return count;
	    }

	    public static void main(String[] args) {
	        String testWord = "alphabets";
	        int vowelCount = countVowels(testWord);
	        System.out.println("Number of vowels in \"" + testWord + "\": " + vowelCount);
	    }
	}

