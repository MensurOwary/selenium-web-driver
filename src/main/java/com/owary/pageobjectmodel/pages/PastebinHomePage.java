/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.pageobjectmodel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.owary.pageobjectmodel.PageObject;

/**
 *
 * @author MansurGulami
 */
public class PastebinHomePage extends PageObject{
    
    @FindBy(id="header_dropdown")
    private WebElement loginDropDown;
    
    @FindBy(className = "dd_lo")
    private WebElement loginButton;
    
    public PastebinHomePage(WebDriver driver) {
        super(driver);
    }
    
    public WebDriver goToLoginPage(){
//    public String goToLoginPage(){
        this.clickDropDown();
        this.clickLoginButton();
        return driver;
    }
    
    private void clickDropDown(){
        this.loginDropDown.click();
    }
    
    private void clickLoginButton(){
        this.loginButton.click();
    }
    
}
