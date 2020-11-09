package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay() {
        assertThat(MultipleSwitchWeek.numberOfDay("Понедельник"), is(1));
    }

    @Test
    public void numberOfDay1() {
        assertThat(MultipleSwitchWeek.numberOfDay("123"), is(-1));
    }
}