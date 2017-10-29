package com.s3group;

import com.s3group.PageObject.ResultPage;
import com.s3group.PageObject.S3MainPage;
import org.testng.annotations.Test;
import setUp.TestBase;

public class BasicTest extends TestBase {

    private String SEARCH_TERM = "Test automation";
    private S3MainPage s3MainPage;

    @Test
    public void shouldFoundResultsSearchingForSearchTerm() {

        s3MainPage = new S3MainPage();
        ResultPage resultPage = s3MainPage
                .unHideSearchBox()
                .fillIntoSearchBoxText(SEARCH_TERM)
                .clickSearchButton();

        resultPage.assertIsWithinResultsText(SEARCH_TERM);
    }
}