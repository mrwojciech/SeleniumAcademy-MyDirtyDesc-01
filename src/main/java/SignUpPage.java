import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignUpPage {
    WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(SignUpPage.class);

    @FindBy(css = "#input_2_1_3")
    WebElement firstNameTextField;

    @FindBy(css = "#input_2_1_6")
    WebElement lastNameTextField;

    @FindBy(css = "#input_2_2")
    WebElement companyTextField;

    @FindBy(css = "#input_2_3")
    WebElement jobTitleTextField;

    @FindBy(css = "#input_2_4")
    WebElement emailTextField;

    @FindBy(css = "#input_2_5")
    WebElement passTextField;

    @FindBy(css = "#input_2_5_2")
    WebElement confirmPassTextField;

    @FindBy(css = "#input_2_6_1")
    WebElement adressTextField;

    @FindBy(css = "#input_2_6_3")
    WebElement streetAddress1TextField;

    @FindBy(css = "#input_2_6_4")
    WebElement streetAddress2TextField;

    @FindBy(css = "#input_2_6_5")
    WebElement cityTextField;

    @FindBy(tagName = "option")
    List<WebElement> countryComboBox;

    @FindBy(css = "#input_2_7")
    WebElement phoneTextField;

    @FindBy(css = "#gform_submit_button_2")
    WebElement registerButton;

    @FindBy(css = "#cookie-acceptance > button:nth-child(1)")
    WebElement cookieOk;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        log.info("Creating SignUpPage object");
        PageFactory.initElements(driver, this);
        log.info("Initiating the PageFactory for SignUpPage");

    }

    public SignUpPage closeCoockiePopup() {
        cookieOk.click();
        log.info("Closing the cookie popup");
        return this;
    }

    public SignUpPage fillUpAllWithRandomData() {
        firstNameTextField.sendKeys("Wojtek");
        log.info("Filling out the First Name");
        lastNameTextField.sendKeys("Nowak");
        log.info("Filling out the Last Name");
        companyTextField.sendKeys("google");
        log.info("Filling out the Company Name");
        jobTitleTextField.sendKeys("Testing");
        log.info("Filling out the Job Title");
        emailTextField.sendKeys("wojtek@niepodam.pl");
        log.info("Filling out the email");
        passTextField.sendKeys("niepodam");
        log.info("Filling out the password");
        confirmPassTextField.sendKeys("niepodam");
        log.info("Filling out the password confirmation");
        adressTextField.sendKeys("Horbaczewskiego 6");
        log.info("Filling out the adress");
        streetAddress1TextField.sendKeys("Dolny Sląsk");
        log.info("Filling out the street address");
        streetAddress2TextField.sendKeys("Fabryczna");
        log.info("Filling out the street address line two");
        cityTextField.sendKeys("Wrocław");
        log.info("Filling out the city");
        phoneTextField.sendKeys("222-333-444");
        log.info("Filling out the phone number");
        countryComboBox.get(10).click();
        log.info("Selecting the country from combobox");
        return this;
    }

    public SuccessRegister clickRegisterButton() {
        registerButton.click();
        log.info("Clicking on the Register button");
        return new SuccessRegister(driver);

    }
}
