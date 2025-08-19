package cse;
import java.util.*;
	public class sub {
        public static boolean isPalindrome(String word) {
	        word = word.toLowerCase();
	        int length = word.length();

	        for (int i = 0; i < length / 2; i++) {
	            String startChar = word.substring(i, i + 1);
	            String endChar = word.substring(length - 1 - i, length - i);

	            if (!startChar.equals(endChar)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String testWord = "aeroplane";
	        if (isPalindrome(testWord)) {
	            System.out.println(testWord + " is a palindrome.");
	        } else {
	            System.out.println(testWord + " is not a palindrome.");
	        }
	    }
	}
