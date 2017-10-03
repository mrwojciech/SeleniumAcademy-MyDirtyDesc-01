package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class CareersPage extends BasePage {
    private String CAREERS_TITLE = "Careers at S3 Group";
    @FindBy(css = "title")
    private WebElement title;


    public void checkIfPageIsPresent() {

        waitUntilTitleIsPresent(CAREERS_TITLE);
        log.info("Wait till title appears:" + CAREERS_TITLE);
        assertEquals(title.getAttribute("text"), CAREERS_TITLE);
        log.info("Asserting the title of Careers Page");
    }
}
