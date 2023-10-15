package edu;

import edu.hw1.Task3;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Task3Test {

    @Test
    public void testCanBeNestedWhenEmptyArrays() {
        int[] a1 = {};
        int[] a2 = {};
        assertFalse(Task3.canBeNested(a1, a2));
    }

    @Test
    public void testCanBeNestedWhenFirstArrayEmpty() {
        int[] a1 = {};
        int[] a2 = {1, 2, 3};
        assertFalse(Task3.canBeNested(a1, a2));
    }

    @Test
    public void testCanBeNestedWhenSecondArrayEmpty() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {};
        assertFalse(Task3.canBeNested(a1, a2));
    }


    @Test
    public void testCanBeNestedWhenCanBeNested() {
        int[] a1 = {2, 3, 4};
        int[] a2 = {1, 2, 3, 4, 5};
        assertTrue(Task3.canBeNested(a1, a2));
    }

    @Test
    public void testCanBeNestedWhenCannotBeNested() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 3, 4};
        assertFalse(Task3.canBeNested(a1, a2));
    }
}

