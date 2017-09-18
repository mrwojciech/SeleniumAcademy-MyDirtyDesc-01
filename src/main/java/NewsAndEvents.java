import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class NewsAndEvents {
    WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(NewsAndEvents.class);


    @FindBy(css = "title")
    WebElement title;

    public NewsAndEvents(WebDriver driver) {
        this.driver = driver;
        log.info("Initiating the News And Events Page object");
        PageFactory.initElements(driver, this);
        log.info("Initiating PageFactory for object News And Events Page.");
    }

    public void checkIfPageIsPresent() {
        assertEquals(title.getAttribute("text"), "S3 Group News & Events");
        log.info("Asserting the title of News And Events Page");
    }
}
