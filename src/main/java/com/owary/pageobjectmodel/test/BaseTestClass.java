/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.pageobjectmodel.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author MansurGulami
 */
public class BaseTestClass {
    
    static WebDriver driver;
    
    @BeforeClass
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MansurGulami\\Desktop\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @AfterClass
    public static void destruct() throws InterruptedException{
        Thread.sleep(10000);
        driver.quit();
    }
    
}
