package edu;

import edu.hw1.Task4;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task4Test {


    @Test
    public void testFixStringWithSingleCharacter() {
        String mixedString = "A";
        String expectedFixedString = "A";
        String actualFixedString = Task4.fixString(mixedString);
        assertEquals(actualFixedString, expectedFixedString);
    }


    @Test
    public void testFixStringWithEmptyString() {
        String mixedString = "";
        String expectedFixedString = "";
        String actualFixedString = Task4.fixString(mixedString);
        assertEquals(actualFixedString, expectedFixedString);
    }
}
