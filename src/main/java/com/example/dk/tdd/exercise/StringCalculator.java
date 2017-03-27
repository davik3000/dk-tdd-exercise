/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dk.tdd.exercise;

/**
 *
 * @author vagrant
 */
public class StringCalculator {

    public static final int add(final String numbers) { // changed void to int
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed.");
        } else {
            for (String number : numbersArray) {
                if (!number.isEmpty()) {
                    Integer.parseInt(number); // if it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue; // added return
    }
}
