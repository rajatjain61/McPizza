package com.Avaamo.McPiazza.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    private WebDriver driver;

    @FindBy(id = "messageInput")
    private WebElement messageInput;

    @FindBy(id = "sendButton")
    private WebElement sendButton;

    @FindBy(id = "vegPizzaButton")
    private WebElement vegPizzaButton;

    @FindBy(id = "nonVegPizzaButton")
    private WebElement nonVegPizzaButton;

    @FindBy(id = "thumbsUpButton")
    private WebElement thumbsUpButton;

    @FindBy(id = "thumbsDownButton")
    private WebElement thumbsDownButton;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sendMessage(String message) {
        messageInput.sendKeys(message);
        sendButton.click();
    }

    public void orderVegPizza() {
        vegPizzaButton.click();
    }

    public void orderNonVegPizza() {
        nonVegPizzaButton.click();
    }

    public void giveThumbsUp() {
        thumbsUpButton.click();
    }

    public void giveThumbsDown() {
        thumbsDownButton.click();
    }
}