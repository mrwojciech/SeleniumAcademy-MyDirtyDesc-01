package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends BasePage {

    @FindBy(css = "p.title")
    private List<WebElement> results;

    public boolean checkIFResultsContainText(String searchedTerm) {
        WebElement firstResultOfSearch = results.get(0);
        waitTillIsClickable(firstResultOfSearch);
        log.info("Wait till the element is clickable");
        for (WebElement result : results) {
            if (result.getText().toLowerCase().contains(searchedTerm)) return true;
        }
        log.info("Asserting the search results");
        return false;
    }
}