package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class About extends BasePage {
    private String ABOUT_US_TITLE = "About Us - S3 Group";

    @FindBy(css = "title")
    private WebElement title;

    public void assertIsPagePresent() {
// dodac cos jeszcze do sprawdzenia czy strona jest obecna i do pozoastlych rowniez

        waitUntilTitleIsPresent(title, ABOUT_US_TITLE);
        assertThat(title.getAttribute("text"), is(equalTo((ABOUT_US_TITLE))));
        log.info("Asserting the title of About Page");
    }

}