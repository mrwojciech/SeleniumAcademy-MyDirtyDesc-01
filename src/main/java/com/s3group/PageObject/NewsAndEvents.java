package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class NewsAndEvents extends BasePage {
    private String S3GROUP_NEWS_TITLE = "S3 Group News & Events";
    @FindBy(css = "title")
    private WebElement title;


    public void checkIfPageIsPresent() {

        log.info("Wait till title appears:" + S3GROUP_NEWS_TITLE);
        waitUntilTitleIsPresent(S3GROUP_NEWS_TITLE);
        assertEquals(title.getAttribute("text"), S3GROUP_NEWS_TITLE);
        log.info("Asserting the title of News And Events Page");
    }
}
