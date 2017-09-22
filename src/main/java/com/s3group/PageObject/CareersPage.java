package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class CareersPage extends BasePage {

    @FindBy(css = "title")
    private WebElement title;


    public void checkIfPageIsPresent() {
        waitUntilTitleIsPresent("Careers at S3 Group");
        log.info("Wait till title appears:" + "Careers at S3 Group");
        assertEquals(title.getAttribute("text"), "Careers at S3 Group");
        log.info("Asserting the title of Careers Page");
    }
}
