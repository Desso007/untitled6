package edu;

import edu.hw1.Task7;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task7Test {


    @Test
    public void testRotateRight() {
        int n = 0b1100;
        int shift = 2;
        int resultRight = Task7.rotateRight(n, shift);
        assertEquals(resultRight, 0b0011);
    }
}
