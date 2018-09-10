/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author MansurGulami
 */
public class DraggableTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MansurGulami\\Desktop\\Data\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        Actions actions = new Actions(driver);

        actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
        
        Thread.sleep(2000);
        
        driver.quit();
    }

}
