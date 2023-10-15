package edu;

import edu.hw1.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Task5Test {
    @Test
    public void testIsPalindrome() {
        assertTrue(Task5.isPalindrome(12321));
        assertTrue(Task5.isPalindrome(1));
        assertTrue(Task5.isPalindrome(11));
        assertFalse(Task5.isPalindrome(123));
        assertFalse(Task5.isPalindrome(12345));
        assertTrue(Task5.isPalindrome(10001));
    }

}
