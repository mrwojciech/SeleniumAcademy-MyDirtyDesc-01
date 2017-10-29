package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.hamcrest.core.IsCollectionContaining;
import org.hamcrest.core.StringContains;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

public class ResultPage extends BasePage {

    @FindBy(css = "p.title")
    private List<WebElement> results;

    public boolean assertIsWithinResultsText(String searchedTerm) {
        WebElement firstResultOfSearch = results.get(0);
        waitTillIsClickable(firstResultOfSearch);
        List<String> resultsTxt =
                results.stream().map(WebElement::getText).map(String::toLowerCase).collect(Collectors.toList());
        assertThat(resultsTxt, IsCollectionContaining.hasItem(StringContains.containsString(searchedTerm)));
        log.info("Asserting the search results");
        return false;
    }
}