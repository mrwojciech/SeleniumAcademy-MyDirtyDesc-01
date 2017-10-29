package com.s3group.Utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits extends MyLogger {

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    public WebElement waitUntilTitleIsPresent(WebElement title, String textTile) {
        log.info("Waiting till title is present: "+textTile);
        wait.ignoring(NoSuchElementException.class)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
                .until(ExpectedConditions.titleContains(textTile));
        return title;
    }

    public WebElement waitTillIsClickable(WebElement element) {
        log.info("Waiting till the element is clickable: "+element.getText());
        WebElement until = wait
                .ignoring(NoSuchElementException.class)
                .pollingEvery(250,TimeUnit.MILLISECONDS)
                .until(ExpectedConditions.elementToBeClickable(element));
        return until;

    }


}