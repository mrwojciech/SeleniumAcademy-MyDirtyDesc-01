package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class About extends BasePage {

    @FindBy(css = "title")
    private WebElement title;

    public void checkIfPageIsPresent() {
        log.info("Wait till title appears:" + "About Us - S3 Group");
        waitUntilTitleIsPresent("About Us - S3 Group");
        assertEquals(title.getAttribute("text"), "About Us - S3 Group");
        log.info("Asserting the title of About Page");
    }
}