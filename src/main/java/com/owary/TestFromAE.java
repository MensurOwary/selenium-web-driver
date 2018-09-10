/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author MansurGulami
 */
public class TestFromAE {
   
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MansurGulami\\Desktop\\Data\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        // Go to the webpage
        driver.get("https://az.fromae.com/az/");
        driver.manage().window().maximize();
        
        // Go to periphery -> notebooks
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a")))
                .moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/ul/li[2]/div/a")))
                .click()
                .build()
                .perform();
        
        
        // some specs
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[2]/ol/li[1]/a")).click();
        
//        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id=\"loading\"]"))));
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[2]/ol/li[7]/a"))));
        
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[2]/ol/li[7]/a")).click();
        
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id=\"loading\"]"))));
        
        // click lowest to highest
        driver.findElement(By.xpath("//*[@id=\"catalog-listing\"]/div/div[1]/div/div/ul/li[2]/a"))
                .click();
        
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id=\"loading\"]"))));
        
        // select the hightest on the page
        List<WebElement> list = driver.findElements(By.className("item"));
        list.get(list.size()-1).click();
        
        // give 2 stars
        driver.findElement(By.cssSelector("#rating-stars > li:nth-child(2)")).click();
        
        // add some desc
        driver.findElement(By.id("nickname_field")).sendKeys("Test");
        driver.findElement(By.id("summary_field")).sendKeys("Test desc");
        driver.findElement(By.id("review_field")).sendKeys("Test long desc");
        
        Thread.sleep(1000);
        
        // add to card
        driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[1]/button")).click();
        
        Thread.sleep(2000);

        // complete the purchase
        driver.findElement(By.xpath("//*[@id=\"btn_cfaction\"]")).click();
        
        Thread.sleep(2000);
        
        // go back
        
        driver.navigate().back();
        
        Thread.sleep(5000);
        driver.quit();
        
   }
    
    
}
