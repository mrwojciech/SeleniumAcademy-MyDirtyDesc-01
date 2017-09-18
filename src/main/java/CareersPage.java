import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CareersPage {

    private WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(CareersPage.class);


    @FindBy(css = "title")
    WebElement title;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
        log.info("Initiating the CareersPage object");
        PageFactory.initElements(driver, this);
        log.info("Initiating PageFactory for object CareersPage.");
    }


    public void checkIfPageIsPresent() {
        assertEquals(title.getAttribute("text"), "Careers at S3 Group");
        log.info("Asserting the title of Careers Page");
    }
}
