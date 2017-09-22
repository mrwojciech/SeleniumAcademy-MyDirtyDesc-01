package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class NewsAndEvents extends BasePage {

    @FindBy(css = "title")
    private WebElement title;


    public void checkIfPageIsPresent() {
        log.info("Wait till title appears:" + "S3 Group News & Events");
        waitUntilTitleIsPresent("S3 Group News & Events");
        assertEquals(title.getAttribute("text"), "S3 Group News & Events");
        log.info("Asserting the title of News And Events Page");
    }
}
