package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CareersPage extends BasePage {
    private String CAREERS_TITLE = "Careers at S3 Group";

    @FindBy(css = "title")
    private WebElement title;

    public void assertIsPagePresent() {

        waitUntilTitleIsPresent(title, CAREERS_TITLE);
        assertThat(title.getAttribute("text"), is(equalTo((CAREERS_TITLE))));
        log.info("Asserting the title of Careers Page");
    }
}
