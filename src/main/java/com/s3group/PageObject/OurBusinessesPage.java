package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class OurBusinessesPage extends BasePage {

    @FindBy(css = "title")
    private WebElement title;

    public void checkIfPageIsPresent() {
        log.info("Wait till title appears:" + "Connected Consumer Technology Company | S3 Group");
        waitUntilTitleIsPresent("Connected Consumer Technology Company | S3 Group");
        assertEquals(title.getAttribute("text"), "Connected Consumer Technology Company | S3 Group");
        log.info("Asserting the title of Our Business Page");
    }
}