import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OurBusinessesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final Logger log = LoggerFactory.getLogger(OurBusinessesPage.class);

    @FindBy(css = "title")
    WebElement title;


    public OurBusinessesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        log.info("Initiating the OurBusinessPage object");
        PageFactory.initElements(driver, this);
        log.info("Initiating PageFactory for object OurBusinessPage.");
    }

    public void checkIfPageIsPresent() {
        wait.until(ExpectedConditions.elementToBeClickable(title));
        log.info("Wait till the element is clicable");
        assertEquals(title.getAttribute("text"), "About Us - S3 Group");
        log.info("Asserting the title of Our Business Page");
    }
}
