import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CareersPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private final Logger log = LoggerFactory.getLogger(CareersPage.class);


    @FindBy(css = "title")
    WebElement title;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        log.info("Initiating the CareersPage object");
        PageFactory.initElements(driver, this);
        log.info("Initiating PageFactory for object CareersPage.");
    }


    public void checkIfPageIsPresent() {
        try {
            log.info("Wait till title appears:" + "Careers at S3 Group");
            wait.until(ExpectedConditions.titleContains("Careers at S3 Group"));
        } catch (TimeoutException e) {
            log.error("Timeout exception - expected tile did not appear");
        }
        assertEquals(title.getAttribute("text"), "Careers at S3 Group");
        log.info("Asserting the title of Careers Page");
    }
}
