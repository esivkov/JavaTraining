package com.company.training;

import static org.junit.Assert.*;

public class ArrayOperationsTest {

    private int[] numbers = {1, 5, 3, 6, 10, 2};

    @org.junit.Test
    public void getFirstElementTest() throws Exception {
        assertEquals(1, ArrayOperations.getFirstElement(numbers));

    }

    @org.junit.Test
    public void findLastElementTest() throws Exception {
        assertEquals(2, ArrayOperations.getLastElement(numbers));
    }

    @org.junit.Test
    public void findSumTest() throws Exception {
        assertEquals(25, ArrayOperations.findSum(numbers));
    }

    @org.junit.Test
    public void toStringTest() throws Exception {
        assertEquals("[1, 5, 3, 6, 10, 0]", ArrayOperations.toString(numbers));
    }

    @org.junit.Test
    public void getMaxElement() throws Exception {
        assertEquals(10, ArrayOperations.getMaxElement(numbers));
    }

}