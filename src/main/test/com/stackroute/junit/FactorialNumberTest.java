package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class FactorialNumberTest {

    FactorialNumber factorialTest;
    @Before
    public void setUp() throws Exception {
        factorialTest=new FactorialNumber();
    }

    @After
    public void tearDown() throws Exception
    {
        factorialTest=null;
    }

    @Test
    public void TestlongFactorial() {
        assertEquals(120,FactorialNumber.longFactorial(5));
        assertEquals(2,FactorialNumber.longFactorial(2));
        assertEquals(1,FactorialNumber.longFactorial(0));

    }

}