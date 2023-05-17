package dev.chumin.testing_github_copilot.service;

import dev.chumin.testing_github_copilot.utils.StringUtils;

public class WhiteBoardService {
    // is palindrome?
    public static boolean isPalindrome(String str) {
        return str.equals(StringUtils.reverse(str));
    }
}
