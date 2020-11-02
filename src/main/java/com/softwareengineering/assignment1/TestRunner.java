/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwareengineering.assignment1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author noracasey
 */
public class TestRunner {
    public static void main(String[] args){
        // Testing Username Creation is Correct
        Result result = JUnitCore.runClasses(CollegeTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("JUnit Testing was Successful: "+result.wasSuccessful());
    }
}
