package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class OurBusinessesPage extends BasePage {
    private String OUR_BUSINESS_TITLE = "Connected Consumer Technology Company | S3 Group";
    @FindBy(css = "title")
    private WebElement title;

    public void checkIfPageIsPresent() {

        log.info("Wait till title appears:" + OUR_BUSINESS_TITLE);
        waitUntilTitleIsPresent(OUR_BUSINESS_TITLE);
        assertEquals(title.getAttribute("text"), OUR_BUSINESS_TITLE);
        log.info("Asserting the title of Our Business Page");
    }
}