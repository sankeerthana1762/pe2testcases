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
    public void averageOfMarks() {
        int inputArray[]={80,90,80,90};
        assertEquals(85,students.average(inputArray));
        assertNotEquals(100,students.average(inputArray));
    }
    @Test
    public void averageExceeded() { //checking exceeded values out of 100//
        int inputArray[]={25,25,101,25};
        assertNotNull("Null is not Expected!",students.average(inputArray));
    }
    @Test
    public void MinimumOfMarks() { //checking the minimum marks
        int inputArray[]={54,32,78,92};
        assertNotNull("Null is not Expected!",students.minimumOfMarks(inputArray));
    }
    @Test
    public void givenArrayShouldReturnMinimumMarks() { //checking the minimum marks
        int inputArray[]={54,32,78,92};
        assertEquals(32,students.minimumOfMarks(inputArray));
    }

    @Test
    public void MaximumOfMarks() { //checking the maximum marks
        int inputArray[]={54,32,78,92};
        assertNotNull("Null is not Expected!",students.maximumOfMarks(inputArray));
    }
    @Test
    public void givenArrayShouldReturnMaximumMarks() { //checking the maximum marks
        int inputArray[]={54,32,78,92};
        assertEquals(92,students.maximumOfMarks(inputArray));
    }

}