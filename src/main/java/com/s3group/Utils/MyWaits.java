package com.s3group.Utils;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWaits extends MyLogger{

    public WebDriverWait wait = new WebDriverWait(MyDriver.getDriver(), 5);

    public boolean waitUntilTitleIsPresent(String textTile) {
        return wait.ignoring(TimeoutException.class).until(ExpectedConditions.titleContains(textTile));
    }

    public void waitTillIsClicable(WebElement element) {
        wait.ignoring(TimeoutException.class).until(ExpectedConditions.elementToBeClickable(element));
    }
}