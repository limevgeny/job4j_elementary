package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
            int result = Max.max(1, 2);
            assertThat(result, is(2));
    }

    @Test
    public void whenMax5To4Then5() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax8To8Then8() {
        int result = Max.max(8, 8);
        assertThat(result, is(8));
    }
}