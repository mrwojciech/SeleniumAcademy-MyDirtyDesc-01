package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;
public class About extends BasePage {
    private String ABOUT_US_TITLE = "About Us - S3 Group";

    @FindBy(css = "title")
    private WebElement title;

    public void checkIfPageIsPresent() {

        log.info("Wait till title appears:" + ABOUT_US_TITLE);
        waitUntilTitleIsPresent(ABOUT_US_TITLE);
        assertEquals(title.getAttribute("text"), ABOUT_US_TITLE);
        log.info("Asserting the title of About Page");
    }
}