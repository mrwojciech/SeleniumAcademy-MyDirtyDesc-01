package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class OurBusinessesPage extends BasePage {

    private String OUR_BUSINESS_TITLE = "Connected Consumer Technology Company | S3 Group";

    @FindBy(css = "title")
    private WebElement title;

    public void assertIsPagePresent() {
        waitUntilTitleIsPresent(title, OUR_BUSINESS_TITLE);
        assertThat(title.getAttribute("text"), is(equalTo((OUR_BUSINESS_TITLE))));
        log.info("Asserting the title of Our Business Page");
    }
}