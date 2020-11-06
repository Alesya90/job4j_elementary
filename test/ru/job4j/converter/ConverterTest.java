package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        double in = 140;
        double expected = 2;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        double in = 180;
        double expected = 3;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        double in = 0;
        double expected = 0;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0);
    }

}