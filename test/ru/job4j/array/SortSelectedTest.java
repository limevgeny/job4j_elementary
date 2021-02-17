package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSort5Numbers() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort3Numbers() {
        int[] input = new int[] {2, 3, 1};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result, is(expected));
    }

}