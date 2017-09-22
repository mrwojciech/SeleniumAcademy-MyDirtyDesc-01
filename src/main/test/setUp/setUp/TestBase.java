package setUp;

import com.s3group.PageObject.S3MainPage;
import com.s3group.Utils.MyLogger;
import com.s3group.Utils.MyProperties;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.s3group.Utils.MyDriver.getDriver;

public class TestBase extends MyLogger {

    public S3MainPage s3MainPage;
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setupDriver() {

        this.driver = getDriver();
        //TODO podpiac fabryke z MyDirver instaanitiate
        log.info("Initiating driver: {}", MyProperties.getBrowser());
        log.info("Set explicit time to : {}", 5);
        driver.get(MyProperties.getBaseURL());
        log.info("Navigating to Home page: {}", MyProperties.getBaseURL());
        s3MainPage = new S3MainPage();
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
        log.info("Closing the driver");
    }
}