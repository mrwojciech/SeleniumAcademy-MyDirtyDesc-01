package setUp;

import com.s3group.Utils.Driver;
import com.s3group.Utils.MyLogger;
import com.s3group.Utils.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static com.s3group.Utils.Properties.getBaseURL;


public class TestBase extends MyLogger {


    private int EXPLICITE_TIME_MAX_WAIT;

    @BeforeClass
    public  void startDriver() {
        Driver.getDriver();
        log.info("Initiating driver: {}", Properties.getBrowser());
        Driver.getDriver().get(getBaseURL());
        log.info("Navigating to Home page: {}", getBaseURL());
    }

    @BeforeTest
    public void setupDriver() {
        EXPLICITE_TIME_MAX_WAIT = 5;
        log.info("Set explicit time to : {}", EXPLICITE_TIME_MAX_WAIT);
        Driver.getDriver().get(getBaseURL());
        log.info("Navigating to Home page: {}", getBaseURL());
    }

    @AfterTest
    public void tearDownDriver() {
        log.info("Closing the driver");
    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            File scrFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                    + Arrays.toString(testResult.getParameters()) + ".jpg"));
        }
    }


    @AfterClass
    public void quitDriver() {
        Driver.getDriver().close();
        Driver.getDriver().quit();
        Driver.setToNull();
    }
}