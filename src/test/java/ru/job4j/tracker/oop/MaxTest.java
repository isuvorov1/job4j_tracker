package ru.job4j.tracker.oop;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void isFirstMax() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = right;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void isSecondMax() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = right;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void ifEqual() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

}
