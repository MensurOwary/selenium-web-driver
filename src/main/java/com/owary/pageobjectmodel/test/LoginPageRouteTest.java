/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.pageobjectmodel.test;

import static org.junit.Assert.assertEquals;

import com.owary.pageobjectmodel.pages.PastebinHomePage;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author MansurGulami
 */
public class LoginPageRouteTest extends BaseTestClass{
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LoginPageRouteTest.class);
        result.getFailures().forEach(System.out::println);
        System.out.println("Test was successful : "+result.wasSuccessful());
    }
    
    @Test
    public void loginPageRoute(){
        PastebinHomePage home = new PastebinHomePage(driver);
        driver.get("https://pastebin.com/");
        assertEquals("Pastebin.com - Login Page", home.goToLoginPage().getTitle());
    }
    
    
}
