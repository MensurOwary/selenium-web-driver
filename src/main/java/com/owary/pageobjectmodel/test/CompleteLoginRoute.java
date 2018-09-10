/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.pageobjectmodel.test;

import static org.junit.Assert.assertEquals;

import com.owary.pageobjectmodel.pages.PastebinHomePage;
import com.owary.pageobjectmodel.pages.PastebinLoginPage;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author MansurGulami
 */
public class CompleteLoginRoute extends BaseTestClass{
    
    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(CompleteLoginRoute.class);
        res.getFailures().forEach(System.out::println);
        System.out.println("Test was successful : "+res.wasSuccessful());
    }
    
    
    @Test
    public void testFullPath(){
        PastebinHomePage home = new PastebinHomePage(driver);
        driver.get("https://pastebin.com/");
        PastebinLoginPage login = new PastebinLoginPage(home.goToLoginPage());
        assertEquals("owary", login.submitLoginForm());
    }
}
