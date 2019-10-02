package com.riotgames.sample;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit test for simple CalcApp.
 */
public class CalcAppTest {
    @Test
    public void testCalcAppDoesCorrectAddOperation() {
        String[] args = new String[] { "1", "+", "2" };

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(3.0));
    }

    @Test
    public void testCalcAppDoesCorrectSubOperation() {
        String[] args = new String[] { "2", "-", "1" };

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(1.0));
    }

    @Test
    public void testCalcAppDoesCorrectMulOperation() {
        String[] args = new String[] { "4", "*", "2" };

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(8.0));
    }

    @Test
    public void testCalcAppDoesCorrectDivOperation() {
        String[] args = new String[] { "4", "/", "2" };

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(2.0));
    }
}
