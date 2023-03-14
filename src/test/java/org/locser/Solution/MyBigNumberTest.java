package org.locser.Solution;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;


public class MyBigNumberTest {
    @Test
    public void testSum1() {
        MyBigNumber mbn = new MyBigNumber();
        String stn1 = "11999";
        String stn2 = "22255554";
        String expectedResult = "22267553";
        String result = mbn.sum(stn1, stn2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSum2() {
        MyBigNumber mbn = new MyBigNumber();
        String stn1 = "399";
        String stn2 = "299";
        String expectedResult = "698";
        String result = mbn.sum(stn1, stn2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumWithLog1() {
        MyBigNumber mbn = new MyBigNumber();
        String stn1 = "399";
        String stn2 = "299";
        String expectedResult = "698";
        String result = mbn.sum(stn1, stn2);
        Logger logger =  mbn.getLOGGER();
        Logger expectedLogger = Logger.getLogger(MyBigNumber.class.getName());
        assertEquals(logger, expectedLogger);
    }

    @Test
    public void testSumWithLog() {
        MyBigNumber mbn = new MyBigNumber();
        String stn1 = "399";
        String stn2 = "299";
        String expectedResult = "698";
        String result = mbn.sum(stn1, stn2);
        assertEquals(expectedResult, result);
    }

}
