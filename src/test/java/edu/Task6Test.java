package edu.hw1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task6Test {
    @Test
    public void testKaprekarSteps() {
        assertEquals(Task6.kaprekarSteps(3524), 3);
        assertEquals(Task6.kaprekarSteps(6174), 0);
        assertEquals(Task6.kaprekarSteps(1234), 3);
        assertEquals(Task6.kaprekarSteps(2111), 5);
    }
}
