package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class NewsAndEvents extends BasePage {
    private String S3GROUP_NEWS_TITLE = "S3 Group News & Events";
    @FindBy(css = "title")
    private WebElement title;


    public void assertIsPagePresent() {

        waitUntilTitleIsPresent(title, S3GROUP_NEWS_TITLE);
        assertThat(title.getAttribute("text"), is(equalTo((S3GROUP_NEWS_TITLE))));
        log.info("Asserting the title of News And Events Page");
    }
}
