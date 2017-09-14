import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class ResultPage {

    private WebDriver driver;

    @FindBy(css = "a")
    List<WebElement> results;


    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkIFResultsContaintText(String searchedTerm) {
        int resultCounter = 0;
        for (WebElement e : results) {
            if (e.getAttribute("text").toLowerCase().contains("test automation")) return true;
        }
        return false;
    }
}

