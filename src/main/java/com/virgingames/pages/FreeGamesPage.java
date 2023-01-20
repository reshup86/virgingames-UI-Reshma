package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGamesPage extends Utility {

    private static final Logger log = LogManager.getLogger(FreeGamesPage.class.getName());

    public FreeGamesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Free Games')]")
    WebElement freeGamesLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Experience a Selection of Free Games')]")
    WebElement header;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement cookie;

    public void acceptCookie() {
        clickOnElement(cookie);
        log.info("Accept cookies : " + cookie.toString());
    }

    public void clickOnFreeGamesLink() {
        clickOnElement(freeGamesLink);
        log.info("Click on Free Games link : " + freeGamesLink.toString());
    }

    public String getText() {
        String message = getTextFromElement(header);
        log.info("Getting text from: " + header.toString());
        return message;
    }

}
