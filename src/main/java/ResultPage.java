import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ResultPage {

    private WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(ResultPage.class);
    @FindBy(css = "p.title")
    List<WebElement> results;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        log.info("Initiating Result Page object");
        PageFactory.initElements(driver, this);
        log.info("Initiating PageFactory for ResultPage");
    }

    public boolean checkIFResultsContainText(String searchedTerm) {
        for (WebElement result : results) {
            if (result.getText().toLowerCase().contains("test automation")) return true;
        }
        log.info("Asserting the search results");
        return false;
    }
}