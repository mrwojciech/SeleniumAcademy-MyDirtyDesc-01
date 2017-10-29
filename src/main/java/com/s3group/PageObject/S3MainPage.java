package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class S3MainPage extends BasePage {

    @FindBy(className = "btn")
    private WebElement searchButton;
    //  private Button searchButton;
//TODO why it is not workin above!?

    @FindBy(id = "search-term")
    private WebElement searchTextBox;

    @FindBy(id = "menu-item-401")
    private WebElement careersButton;

    @FindBy(id = "menu-item-645")
    private WebElement newsAndEventsButton;

    @FindBy(id = "menu-item-653")
    private WebElement aboutButton;

    @FindBy(id = "menu-item-1098")
    private WebElement ourBusinessesButton;

    // Please note that this element from: www.s3group.com has this weird
    // CSS:     #main-nav > ul > li:nth-child(1) > a
    // xPath   *[@id="main-nav"]/ul/li[1]/a
    @FindBy(css = ".navbar-top > li:nth-child(1) > a:nth-child(1)")
    private WebElement signUpButton;

    public S3MainPage unHideSearchBox() {
        waitTillIsClickable(searchButton);
        if (!searchTextBox.isDisplayed()){
            searchButton.click();
            log.info("Clicking on the search Button");
        }
        return this;
    }

    public ResultPage clickSearchButton() {
        searchButton.click();
        waitTillIsClickable(searchButton);
        log.info("Clicking the search button");
        return new ResultPage();
    }

    public S3MainPage fillIntoSearchBoxText(String searchedTerm) {
        searchTextBox.sendKeys(searchedTerm);
        waitTillIsClickable(searchTextBox);
        log.info("Filling the search term: {} into the search box", searchedTerm);
        return this;
    }

    public CareersPage goToCareersPage() {
        waitTillIsClickable(careersButton);
        careersButton.click();
        log.info("Clicking the Careers Page link");
        return new CareersPage();

    }

    public NewsAndEvents goToNewAndEventsPage() {
        waitTillIsClickable(newsAndEventsButton);
        newsAndEventsButton.click();
        log.info("Clicking the News And Events Page link");
        return new NewsAndEvents();
    }

    public About goToAboutPage() {
        waitTillIsClickable(aboutButton);
        aboutButton.click();
        log.info("Clicking the PageObject.About Page link");
        return new About();
    }

    public OurBusinessesPage goToOurBusinessesPage() {
        waitTillIsClickable(aboutButton);
        ourBusinessesButton.click();
        log.info("Clicking the Our Business Page link");
        return new OurBusinessesPage();
    }

    public SignUpPage goToSignUpPage() {
        waitTillIsClickable(signUpButton);
        signUpButton.click();
        log.info("Clicking the Sign Up Page link");
        return new SignUpPage();
    }
}