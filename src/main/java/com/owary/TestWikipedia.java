/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author MansurGulami
 */
public class TestWikipedia {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MansurGulami\\Desktop\\Data\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.wikipedia.org");
        try {
            System.out.println("here");
            WebElement link = wd.findElement(By.xpath("//*[@id=\"js-link-box-en\"]"));
            link.click();

            Thread.sleep(3000);

            WebElement searchBox = wd.findElement(By.id("searchInput"));
            searchBox.sendKeys("Vivaldi");

            Thread.sleep(3000);
            
            Actions actions = new Actions(wd); 
            
            wd.findElements(By.className("mw-searchSuggest-link")).forEach(el->{
                System.out.println("opening..."+el.getText());
                actions.keyDown(Keys.CONTROL).click(el).keyUp(Keys.CONTROL).build().perform();
            });
            
//            searchBox.submit();

            Thread.sleep(5000);

            wd.quit();
        } catch (Exception e) {
            e.printStackTrace();
            wd.quit();

        }
    }

}
