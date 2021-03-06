package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when04to30then5() {
        double expected = 5;
        Point a = new Point(0, 4);
        Point b = new Point(3, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when55to12then5() {
        double expected = 5;
        Point a = new Point(5, 5);
        Point b = new Point(1, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

}