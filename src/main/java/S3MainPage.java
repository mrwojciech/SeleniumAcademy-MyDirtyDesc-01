import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class S3MainPage {

    private WebDriver driver;

    private final Logger log = LoggerFactory.getLogger(S3MainPage.class);

    @FindBy(className = "btn")
    private WebElement searchButton;

    @FindBy(id = "search-term")
    private WebElement searchTextBox;

    @FindBy(id = "menu-item-401")
    private WebElement careersButton;

    @FindBy(id = "menu-item-645")
    private WebElement newsAndEventsButton;

    @FindBy(id = "menu-item-653")
    private WebElement aboutButton;

    @FindBy(id = "menu-item-653")
    private WebElement ourBusinessesButton;

    @FindBy(css = ".navbar-top > li:nth-child(1) > a:nth-child(1)")
    private WebElement signUpButton;

    public S3MainPage(WebDriver driver) {
        this.driver = driver;
        log.info("Initiating the S3MainPage object");
        PageFactory.initElements(driver, this);
        log.info("Initiating the PageFactory for S3MainPage");
    }

    public S3MainPage unHideSearchBox() {
        searchButton.click();
        log.info("Clicking on the search Button");

        return this;
    }

    public ResultPage searchForTerm(String searchedTerm) {
        searchTextBox.sendKeys(searchedTerm);
        log.info("Filling the search term: {} into the search box", searchedTerm);
        searchButton.click();
        log.info("Clicking the search button");
        return new ResultPage(driver);
    }

    public CareersPage goToCareersPage() {
        careersButton.click();
        log.info("Clicking the Careers Page link");
        return new CareersPage(driver);

    }

    public NewsAndEvents goToNewAndEventsPage() {
        newsAndEventsButton.click();
        log.info("Clicking the News And Events Page link");
        return new NewsAndEvents(driver);
    }

    public About goToAboutPage() {
        aboutButton.click();
        log.info("Clicking the About Page link");
        return new About(driver);
    }

    public OurBusinessesPage goToOurBusinessesPage() {
        aboutButton.click();
        log.info("Clicking the Our Business Page link");
        return new OurBusinessesPage(driver);
    }

    public SignUpPage goToSignUpPage() {
        signUpButton.click();
        log.info("Clicking the Sign Up Page link");
        return new SignUpPage(driver);
    }
}
