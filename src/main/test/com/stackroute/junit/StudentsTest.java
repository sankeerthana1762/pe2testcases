package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    Students students;

    @Before
    public void setUp() throws Exception {
        students=new Students();
    }

    @After
    public void tearDown() throws Exception {
        students=null;
    }

    @Test     // checking average values
    public void average() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,students.average(inputArray));
        assertNotEquals(100,students.average(inputArray));
    }
    @Test
    public void averageExceeded() { //checking exceeded values out of 100//
        int inputArray[]={25,25,101,25};
        assertNotNull("Null is not Expected!",students.average(inputArray));
    }
}