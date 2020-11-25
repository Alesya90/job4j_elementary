package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        assertThat(Factorial.calc(5), Matchers.is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        assertThat(Factorial.calc(0), Matchers.is(1));
    }
}