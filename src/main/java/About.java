import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class About {
    WebDriver driver;
    private WebDriverWait wait;
    private final Logger log = LoggerFactory.getLogger(About.class);

    @FindBy(css = "title")
    WebElement title;

    public About(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver , 5);
        log.info("Initiating the About object");
        PageFactory.initElements(driver, this);
        log.info("Initiating PageFactory for object AboutPage.");
    }

    public void checkIfPageIsPresent() {
        wait.until(ExpectedConditions.elementToBeClickable(title));
        log.info("Wait till the element is clicable");
        assertEquals(title.getAttribute("text"), " About Us- S3 Group");
        log.info("Asserting the title of About Page");
    }
}
