package dev.chumin.testing_github_copilot.utils;

public class StringUtils {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
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
