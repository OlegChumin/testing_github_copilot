package dev.chumin.testing_github_copilot.service;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBoardServiceTest {
    @org.junit.jupiter.api.Test
    void isPalindrome() {
        assertTrue(WhiteBoardService.isPalindrome("abba"));
        assertFalse(WhiteBoardService.isPalindrome("abbc"));
    }
}