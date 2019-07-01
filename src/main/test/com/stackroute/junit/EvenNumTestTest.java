package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest {
        EvenNumTest evenobJ;

        @Before
        public void setUp() {

            System.out.println("Before");
            evenobJ = new EvenNumTest();

        }

        @After
        public void tearDown() {
            System.out.println("After");
            evenobJ = null;
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
        public void givenNumberShouldReturnTrue() {

            boolean result = evenobJ.isEven(64);
            assertEquals("", true, result);
        }
    @Test
    public void givenNumberShouldReturnFalse() {

        boolean result = evenobJ.isEven(23);
        assertEquals("", false, result);
    }
    @Test
    public void givenNumberShouldReturnTrueMessage() {

        boolean result = evenobJ.isEven(-12);
        assertEquals("", true, result);
    }




}