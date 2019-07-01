package com.stackroute.junit;


import static org.junit.Assert.*;
import org.junit.*;

public class PalindromeTest {

    private PalindromeTest rp;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        rp = new PalindromeTest();
    }
    @After
    public void tearDown()
    {
        rp = null;
        System.out.println("After");
    }
    @Test
    public void test1()
    {


        assertEquals("dsasd","dsasd");
    }

}