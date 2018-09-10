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
 * @author Mensur Owary
 */
public class PastebinAddAPaste extends PageObject{
    
    @FindBy(id="header_new_paste")
    WebElement newPasteButton;
    
    @FindBy(id="paste_code")
    WebElement pasteTextarea;
    
    @FindBy(xpath="//*[@id=\"myform\"]/div[3]/div[1]/div[2]/span/span[1]/span/span[2]")
    WebElement syntaxHighlightingArrow;
    
    @FindBy(xpath="/html/body/span/span/span[1]/input")
    WebElement syntaxHighlightingSearch;
    
    @FindBy(css = ".select2-results > ul > li:first-child")
    WebElement syntaxHighlightingResults;
    
    @FindBy(xpath="//*[@id=\"myform\"]/div[3]/div[5]/div[2]/input")
    WebElement pasteTitle;
    
    
    public PastebinAddAPaste(WebDriver driver) {
        super(driver);
    }
    
    public String addNewPaste(){
        this.clickNewPasteButton();
        this.addPaste();
        this.clickHightlightArrowAndProceedWithSyntax();
        this.pasteTitle();
        this.clickNewPasteButton();
        return "demo";
    }
    
    private void clickNewPasteButton(){
        this.newPasteButton.click();
    }
    
    private void addPaste(){
        String javascript = "alert('hello from selenium')";
        this.pasteTextarea.sendKeys(javascript);
    }
    
    private void clickHightlightArrowAndProceedWithSyntax(){
        this.syntaxHighlightingArrow.click();
        this.syntaxHighlightingSearch.sendKeys("JavaScript");
        this.syntaxHighlightingResults.click();
    }
    
    private void pasteTitle(){
        this.pasteTitle.sendKeys("Automation from Selenium");
    }
    
}
