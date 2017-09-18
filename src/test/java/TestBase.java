
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    public WebDriver driver;
    String file = "testConfiguration.properties";
    String baseURL;
    private final Logger log = LoggerFactory.getLogger(TestBase.class);

    @Before
    public void setup() {

        Properties properties = new Properties();

        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(file)) {
            properties.load(inputStream);
            log.info("Trying to load test properties from :{} ", file);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("Error when loading properties from : {}", file);
        }

        String driverType = properties.getProperty("BROWSER");
        log.info("Set driver to : {} ", driverType);
        baseURL = properties.getProperty("ENV");
        log.info("Set baseURL to : {} ", baseURL);
        switch (driverType) {

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
                this.driver = new FirefoxDriver();
                break;

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
                this.driver = new ChromeDriver();

                break;

            default:
                this.driver = new FirefoxDriver();
        }
        log.info("Initiating driver: {}", driverType);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        log.info("Set implicide time to : {}" + 5);
        driver.get(baseURL);
        log.info("Navigating to Home page: {}", baseURL);

    }

    @After
    public void tearDown() {
        driver.close();
        log.info("Closing the driver");
    }
}