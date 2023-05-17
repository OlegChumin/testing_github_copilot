package dev.chumin.testing_github_copilot.utils;

public class StringUtils {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str); // O(n)
        return sb.reverse().toString();
    }

    public static String isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "Not anagrams";
        }
        int[] letters = new int[26];
        for (int i = 0; i < str1.length(); i++) { // Перебор символов строки str1
            letters[str1.charAt(i) - 'a']++; // Увеличение счетчика для данной буквы в str1
            letters[str2.charAt(i) - 'a']--; // Уменьшение счетчика для данной буквы в str2
        }
        for (int letter : letters) { // Проверка счетчиков букв в массиве letters
            if (letter != 0) {
                return "Not anagrams"; // Если счетчик не равен 0, строки не являются анаграммами
            }
        }
        return "Anagrams"; // Если все счетчики равны 0, строки являются анаграммами
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) { // O(n)
            sb.append(reverse(word)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String upcase(String str) {
        return str.toUpperCase();
    }

    public static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static String removeFirstChar(String str) {
        return str.substring(1);
    }

    public static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    public static char[] toCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

}
