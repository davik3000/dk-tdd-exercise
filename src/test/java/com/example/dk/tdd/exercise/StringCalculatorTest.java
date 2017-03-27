/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dk.tdd.exercise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.example.dk.tdd.exercise.StringCalculator;

public class StringCalculatorTest {

//    public StringCalculatorTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void whenNonNumbersIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,x");
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        assertEquals(0, StringCalculator.add(""));
    }
//
//    @Test
//    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
//        assertEquals(3, StringCalculator.add("3"));
//    }
//    
//    @Test
//    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
//        assertEquals(3+6, StringCalculator.add("3,6"));
//    }
}
