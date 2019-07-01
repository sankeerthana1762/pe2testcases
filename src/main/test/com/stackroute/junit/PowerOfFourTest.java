package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour powerobJ;

    @Before
    public void setUp() {

        System.out.println("Before");
        powerobJ = new PowerOfFour();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        powerobJ = null;
    }

    @BeforeClass
    public static void setup() {

        System.out.println("Before");


    }

    @AfterClass
    public static void teardown() {
        System.out.println("After");

    }


    @Test
    public void givenNumberShouldReturnPowerOfFour() {

        String  result = powerobJ.powerOfFour(64);
        assertEquals("", "power of four", result);
    }
    @Test
    public void givenNumberShouldReturnError() {

        String  result = powerobJ.powerOfFour(63);
        assertEquals("", "error", result);
    }

    @Test
    public void givenNumberShouldReturnErrorMessage() {

        String  result = powerobJ.powerOfFour(-64);
        assertEquals("", "error", result);
    }

}