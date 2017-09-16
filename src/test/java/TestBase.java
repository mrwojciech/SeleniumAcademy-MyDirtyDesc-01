import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    String file = "testConfiguration.properties";
    String baseURL;

    @Before
    public void setup() {

        Properties properties = new Properties();

        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(file)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String driverType = properties.getProperty("BROWSER");
        baseURL = properties.getProperty("ENV");

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

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @After
    public void tearDown() {
        driver.close();
    }


}