import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S3MainPage {


    private WebDriver driver;

    @FindBy(className = "btn")
    private WebElement searchButton;

    @FindBy(id = "search-term")
    private WebElement searchTextBox;


    public S3MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public S3MainPage unHideSearchBox() {
        searchButton.click();
        return this;
    }

    public ResultPage searchForTerm(String term) {
        searchTextBox.sendKeys("Test automation");
        searchButton.click();
        return new ResultPage(driver);
    }
}
