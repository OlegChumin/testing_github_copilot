package dev.chumin.testing_github_copilot.utils;

public class StringUtils {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "Not anagrams";
        }
        int[] letters = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i) - 'a']++;
            letters[str2.charAt(i) - 'a']--;
        }
        for (int letter : letters) {
            if (letter != 0) {
                return "Not anagrams";
            }
        }
        return "Anagrams";
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverse(word)).append(" ");
        }
        return sb.toString().trim();
    }
}
