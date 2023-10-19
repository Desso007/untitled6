package edu;

import edu.hw1.Task1;
import org.testng.annotations.Test;


public class Task1Test {

    @Test
    public void testValidInput() {
        assertEquals(763, Task1.videoLengthInSeconds("12:44"));
    }

    private void assertEquals(int i, int i1) {
    }

    @Test
    public void testInvalidFormat() {
        assertEquals(-1, Task1.videoLengthInSeconds("1244"));
    }

    @Test
    public void testInvalidSeconds() {
        assertEquals(-1, Task1.videoLengthInSeconds("12:61"));
    }

    @Test
    public void testNegativeMinutes() {
        assertEquals(-1, Task1.videoLengthInSeconds("-1:30"));
    }

    @Test
    public void testValidLargeInput() {
        assertEquals(59999, Task1.videoLengthInSeconds("999:59"));
    }
}



