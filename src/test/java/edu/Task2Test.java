package edu;

import edu.hw1.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2Test {

    @Test
    public void testCountDigitsPositiveNumber() {
        assertEquals(Task2.countDigits(123), 3);
        assertEquals(Task2.countDigits(987654321), 9);
    }

    @Test
    public void testCountDigitsZero() {
        assertEquals(Task2.countDigits(0), 1);
    }

    @Test
    public void testCountDigitsNegativeNumber() {
        assertEquals(Task2.countDigits(-987688888), 9);
        assertEquals(Task2.countDigits(-7), 1);
    }
}
