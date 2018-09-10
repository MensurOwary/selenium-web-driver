/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author MansurGulami
 */
public class TestGoogle {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MansurGulami\\Desktop\\Data\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(wd, 10);
        try {
            
            WebElement link = wd.findElement(By.linkText("Gmail"));
            link.click();
            
            System.out.println("Gmailing");
            
            Thread.sleep(5000);

            wd.quit();
        } catch (Exception e) {
            e.printStackTrace();
            wd.quit();
        }
    }
    
}
