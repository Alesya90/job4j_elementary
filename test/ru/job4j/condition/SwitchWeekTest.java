package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void nameOfDay1() {
        assertThat(SwitchWeek.nameOfDay(1), is("Понедельник"));
    }

    @Test
    public void nameOfDay() {
        assertThat(SwitchWeek.nameOfDay(-1), is("Ошибка!"));
    }
}