package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

     Palindrome rp;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        rp = new Palindrome();
    }
    @After
    public void tearDown()
    {
        rp = null;
        System.out.println("After");
    }

    @Test
    public void givenInputShouldReturnPalindromeOfInteger(){
        String result=rp.palindromeandReverse("34543");
                assertEquals("Entered input is a palindrome",result);
    }
    @Test
    public void givenInputShouldReturnPalindromeOfString(){
        String result=rp.palindromeandReverse("tit");
        assertEquals("Entered input is a palindrome",result);
    }
    @Test
    public void givenInputShouldReturnNotApalindrome(){
        String result=rp.palindromeandReverse("tittok");
        assertEquals("entered input is not a palindrome",result);
    }
    @Test
    public void givenInputShouldReturnPalindromeorNot(){
        String result=rp.palindromeandReverse("tittok");
        assertNotEquals("Entered input is a palindrome",result);
    }





}