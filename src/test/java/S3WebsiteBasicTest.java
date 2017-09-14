import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.System;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class S3WebsiteBasicTest {

    private WebDriver driver;
    S3MainPage s3MainPage;
    ResultPage resultPage;
    String baseURL = "https://www.s3group.com/";


    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\SeleniumAcademy\\resources\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseURL);
    }


    @After
    public void tearDown() {
        driver.close();
    }


    @Test
    public void SearchForAutomationOfferOnTheS3WebPage() {
        String searchTerm = "Test automation";
        boolean isResult = false;
        s3MainPage = new S3MainPage(driver);
        resultPage = s3MainPage.searchForTerm(searchTerm);
        isResult = resultPage.checkIFResultsContaintText(searchTerm);
        Assert.assertTrue("There are no results for term 'Test Automation' on the page", isResult);

    }


}



