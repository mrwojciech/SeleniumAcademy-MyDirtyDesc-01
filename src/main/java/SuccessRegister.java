import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;



public class SuccessRegister {
    WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(SuccessRegister.class);

    @FindBy(css = "#gform_confirmation_message_2")
    WebElement popup;




    public SuccessRegister(WebDriver driver) {
        this.driver = driver;
        log.info("Initiating the object for SuccessRegisterPage");
        PageFactory.initElements(driver, this);
        log.info("Initiating the PageFactory for SuccessRegisterPage");
    }

    public void isSuccessRegister(){

        assertEquals(popup.getText(),"Your account has been successfully activated. You can now access all restricted resources and areas.");
        log.info("Asserting the successful registration");
    }

}
