package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when1234() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void when22510() {
        int result = Max.max(2, 2, 5, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }

}