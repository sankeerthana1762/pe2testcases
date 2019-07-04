package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;
//compute the factorial of given number

public class FactorialOfNumberTest {
    FactorialOfNumber factorial;
    @Before
    public void setUp()
    {
        factorial=new FactorialOfNumber();
    }//creating object for the class Factorial
    @Test
    public void givenIntegerReturnsFactorialOfNumber(){
        String result=factorial.factorialOfNumber(3);
        String expectedResult="the factorial of1is1\n"+"the factorial of2is2\n"+"the factorial of3is6\n";
        assertEquals(expectedResult,result);
    }
    @Test
    public void givenIntegerZeroReturnsNothing(){
        String result=factorial.factorialOfNumber(0);
        String expectedResult="";
        assertEquals(expectedResult,result);
    }
    @Test
    public void givenNegativeIntegerReturnsException(){
        String result=factorial.factorialOfNumber(-2);
        String expectedResult="Exception";
        assertEquals(expectedResult,result);
    }


    @After
    public void tearDown(){
        factorial=null;
    }
}