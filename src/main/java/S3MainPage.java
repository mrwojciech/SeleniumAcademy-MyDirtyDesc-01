import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class S3MainPage  {

    private WebDriver driver;
    public WebDriverWait wait;
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
        wait = new WebDriverWait(driver, 5);
        log.info("Initiating the S3MainPage object");
        PageFactory.initElements(driver, this);
        log.info("Initiating the PageFactory for S3MainPage");
    }

    public S3MainPage unHideSearchBox() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        //isClicable(searchButton);
        log.info("Wait till the element is clicable");
        searchButton.click();
        log.info("Clicking on the search Button");
        return this;
    }

    public ResultPage searchForTerm(String searchedTerm) {
        wait.until(ExpectedConditions.elementToBeClickable(searchTextBox));
        log.info("Wait till the element is clicable");
        searchTextBox.sendKeys(searchedTerm);
        log.info("Filling the search term: {} into the search box", searchedTerm);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        log.info("Wait till the element is clicable");
        searchButton.click();
        log.info("Clicking the search button");
        return new ResultPage(driver);
    }

    public CareersPage goToCareersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(careersButton));
        log.info("Wait till the element is clicable");
        careersButton.click();
        log.info("Clicking the Careers Page link");
        return new CareersPage(driver);

    }

    public NewsAndEvents goToNewAndEventsPage() {
        wait.until(ExpectedConditions.elementToBeClickable(newsAndEventsButton));
        log.info("Wait till the element is clicable");
        newsAndEventsButton.click();
        log.info("Clicking the News And Events Page link");
        return new NewsAndEvents(driver);
    }

    public About goToAboutPage() {
        wait.until(ExpectedConditions.elementToBeClickable(aboutButton));
        log.info("Wait till the element is clicable");
        aboutButton.click();
        log.info("Clicking the About Page link");
        return new About(driver);
    }

    public OurBusinessesPage goToOurBusinessesPage() {
        wait.until(ExpectedConditions.elementToBeClickable(aboutButton));
        log.info("Wait till the element is clicable");
        aboutButton.click();
        log.info("Clicking the Our Business Page link");
        return new OurBusinessesPage(driver);
    }

    public SignUpPage goToSignUpPage() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        log.info("Wait till the element is clicable");
        signUpButton.click();
        log.info("Clicking the Sign Up Page link");
        return new SignUpPage(driver);
    }
}
