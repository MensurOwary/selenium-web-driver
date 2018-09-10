/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.pageobjectmodel.test;

import static org.junit.Assert.assertEquals;

import com.owary.pageobjectmodel.pages.PastebinAddAPaste;
import com.owary.pageobjectmodel.pages.PastebinHomePage;
import com.owary.pageobjectmodel.pages.PastebinLoginPage;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author Mensur Owary
 */
public class AddNewPasteTest extends BaseTestClass{
    
    
    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(AddNewPasteTest.class);
        res.getFailures().forEach(System.out::println);
        System.out.println("Test was successful : "+res.wasSuccessful());
    }
    
    @Test
    public void testAddingNewPaste(){
        PastebinHomePage home = new PastebinHomePage(driver);
        driver.get("https://pastebin.com/");
        PastebinLoginPage login = new PastebinLoginPage(home.goToLoginPage());
        
        PastebinAddAPaste pastebin = new PastebinAddAPaste(login.submitLoginFormAndGetDriver());
        
        assertEquals("demo", pastebin.addNewPaste());
    }
    
    
}
