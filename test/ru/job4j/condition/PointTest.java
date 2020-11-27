package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        /*int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);*/
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to41then3() {
        int expected = 3;
        /*int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);*/
        Point a = new Point(1, 1);
        Point b = new Point(4, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to04thensqrt32() {
        double expected = Math.sqrt(32);
        /*int x1 = 4;
        int y1 = 0;
        int x2 = 0;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);*/
        Point a = new Point(4, 0);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to68thensqrt34() {
        double expected = Math.sqrt(34);
        /*int x1 = 3;
        int y1 = 3;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);*/
        Point a = new Point(3, 3);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}