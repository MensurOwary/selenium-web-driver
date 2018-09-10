/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.pageobjectmodel.test;

import static org.junit.Assert.assertEquals;

import com.owary.pageobjectmodel.pages.PastebinLoginPage;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author MansurGulami
 */
public class LoggingInFunctionalityTest extends BaseTestClass{

    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LoggingInFunctionalityTest.class);
        result.getFailures().forEach(System.out::println);
        System.out.println("Test was successful : "+result.wasSuccessful());
    }
    
    @Test
    public void testLoggingIn(){
        PastebinLoginPage loginPage = new PastebinLoginPage(driver);
        driver.get("https://pastebin.com/login");
        assertEquals("owary", loginPage.submitLoginForm());
    }

    
}
