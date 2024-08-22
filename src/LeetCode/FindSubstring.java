package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class FindSubstring {
        public static int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            int maxLength = 0;
            int left = 0;
            HashMap<Character, Integer> charIndexMap = new HashMap<>();

            for (int right = 0; right < s.length(); right++) {
                char currentChar = s.charAt(right);
                if (charIndexMap.containsKey(currentChar)) {
                    // Move the left pointer to the right of the last occurrence of the current character
                    left = Math.max(left, charIndexMap.get(currentChar) + 1);
                }
                // Update the index of the current character
                charIndexMap.put(currentChar, right);
                // Update the maximum length
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String s = "abcabcbb";
            int longestLength = lengthOfLongestSubstring(s);
            System.out.println("Length of the longest substring without repeating characters: " + longestLength);
        }
    }

