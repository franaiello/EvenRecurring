package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Write a function which takes in a int []
 * - all integers in the array are assumed to be even occurring.
 * - except for one integer which occurs odd no. of times
 * <p/>
 * the function finds the odd occuring integer and returns it.
 * <p/>
 * [1,2,3,2,2,3,1] = 2
 */
public class EvenRecurringTest {

    @Test(enabled = true)
    public void findRecurringInt() {
        int result = EvenRecurring.findRecurringInt(new int[]{1, 2, 3, 2, 2, 3, 1});
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void bitwiseXOR() {
        int result = EvenRecurring.getOddOccurrence(new int[]{1, 2, 3, 2, 3, 1, 3});
        assertThat(result).isEqualTo(3);
    }
}
