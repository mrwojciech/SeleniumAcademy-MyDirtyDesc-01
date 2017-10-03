package setUp;

import com.s3group.PageObject.S3MainPage;
import com.s3group.Utils.MyDriver;
import com.s3group.Utils.MyLogger;
import com.s3group.Utils.MyProperties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import static com.s3group.Utils.MyDriver.getDriver;
import static com.s3group.Utils.MyProperties.getBaseURL;


public class TestBase extends MyLogger {

    public S3MainPage s3MainPage;
    public WebDriver driver;


    @BeforeClass
    public static void startDriver(){
    MyDriver.getDriver();

    }
    @Before
    public void setupDriver() {
        this.driver = getDriver();
        log.info("Initiating driver: {}", MyProperties.getBrowser());
        log.info("Set explicit time to : {}", 5);
        driver.get(getBaseURL());
        log.info("Navigating to Home page: {}", getBaseURL());
        s3MainPage = new S3MainPage();
    }

    @After
    public void tearDownDriver() {

        log.info("Closing the driver");

    }

    @AfterClass
    public static void quitDriver(){
        MyDriver.getDriver().close();
        MyDriver.getDriver().quit();
    }
}