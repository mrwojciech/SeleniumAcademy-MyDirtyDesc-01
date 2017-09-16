import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class S3WebsiteBasicTest extends TestBase{

    //private WebDriver driver;
    S3MainPage s3MainPage;
    ResultPage resultPage;
    String baseURL = "https://www.s3group.com/";


    @Test
    public void SearchForAutomationOfferOnTheS3WebPage() {
        String searchTerm = "Test automation";
        boolean isResult = false;
        s3MainPage = new S3MainPage(driver);
        isResult = s3MainPage
                .unHideSearchBox()
                .searchForTerm(searchTerm)
                .checkIFResultsContaintText(searchTerm);

        Assert.assertTrue("There are no results for term 'Test Automation' on the page", isResult);

    }


}



