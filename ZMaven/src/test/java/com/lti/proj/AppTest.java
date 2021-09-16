package com.lti.proj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void case1()
    {
       assertEquals(10, new App().sum(5, 5));
    }
    @Test
    public void case2()
    {
    	assertEquals(0, new App().diff(5, 5));
    }
    @Test
    public void case3()
    {
    	assertEquals(15, new App().sum(10, 5));
    }
}
