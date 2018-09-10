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
public class PastebinLoginPage extends PageObject{
    
    @FindBy(xpath = "//*[@id=\"myform\"]/div/div[1]/div[2]/input")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"myform\"]/div/div[2]/div[2]/input")
    private WebElement passwordField;
    
    @FindBy(xpath = "//*[@id=\"myform\"]/div/div[3]/div[2]/input")
    private WebElement loginButton;
    
    @FindBy(id = "header_username")
    private WebElement usernamePostLogin;
    
    public PastebinLoginPage(WebDriver driver) {
        super(driver);
    }
    
    public String submitLoginForm(){
        this.fillUsername();
        this.fillPassword();
        this.clickLoginButton();
        return usernamePostLogin.getText();
    }
    
    public WebDriver submitLoginFormAndGetDriver(){
        this.fillUsername();
        this.fillPassword();
        this.clickLoginButton();
        return driver;
    }
    
    private void fillUsername(){
        this.usernameField.clear();
        this.usernameField.sendKeys("owary");
    }
    
    private void fillPassword(){
        this.passwordField.clear();
        this.passwordField.sendKeys("abc-12345");
    }
    
    private void clickLoginButton(){
        this.loginButton.click();
    }
    
    
    
    
    
}
