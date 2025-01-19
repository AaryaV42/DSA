import java.util.*;
import java.io.*;

public class Solution {
    public static int countNumberOfPalindromeWords(String s) {
        
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        
        String[] words = s.trim().split("\\s+");

        
        int palindromeCount = 0;

       
        for (String word : words) {
            
            String lowerWord = word.toLowerCase();
            
            if (isPalindrome(lowerWord)) {
                palindromeCount++;
            }
        }

        return palindromeCount;
    }

   
    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1; 

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

  
    public static void main(String[] args) {
        
        String s1 = "Nitin and I are good friends";
        System.out.println(countNumberOfPalindromeWords(s1));

        
        String s2 = "Madam taught us the level order traversal of a binary tree yesterday";
        System.out.println(countNumberOfPalindromeWords(s2)); 

       
        String s3 = "We love coding ninjas";
        System.out.println(countNumberOfPalindromeWords(s3));

        
        String s4 = "For the first test case, there are 2 palindrome words only i.e \"Nitin\" and \"I\"";
        System.out.println(countNumberOfPalindromeWords(s4)); 
    }
}
