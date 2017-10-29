package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPage extends BasePage {

    private String FIRST_NAME = "Wojtek";
    private String LAST_NAME = "Nowak";
    private String COMPANY_NAME = "Google";
    private String JOB_TITLE = "Engeener";
    private String EMAIL = "jakis@gmail.com";
    private String PASSWORD = "password";
    private String CONFIRM_PASSWORD = "password";
    private String STREET = "Januszowicka 4";
    private String STREET2 = "Dolny Sląsk";
    private String STREET_ADDRESS = "Muchobór Mały";
    private String CITY = "Wrocław";
    private String PHONE_NUMBER = "44-33-22";
    private int COUNTRY_ID = 10;


    @FindBy(css = "#input_2_1_3")
    private WebElement firstNameTextField;

    @FindBy(css = "#input_2_1_6")
    private WebElement lastNameTextField;

    @FindBy(css = "#input_2_2")
    private WebElement companyTextField;

    @FindBy(css = "#input_2_3")
    private WebElement jobTitleTextField;

    @FindBy(css = "#input_2_4")
    private WebElement emailTextField;

    @FindBy(css = "#input_2_5")
    private WebElement passTextField;

    @FindBy(css = "#input_2_5_2")
    private WebElement confirmPassTextField;

    @FindBy(css = "#input_2_6_1")
    private WebElement adressTextField;

    @FindBy(css = "#input_2_6_3")
    private WebElement streetAddress1TextField;

    @FindBy(css = "#input_2_6_4")
    private WebElement streetAddress2TextField;

    @FindBy(css = "#input_2_6_5")
    private WebElement cityTextField;

    @FindBy(tagName = "option")
    private List<WebElement> countryComboBox;

    @FindBy(css = "#input_2_7")
    private WebElement phoneTextField;

    @FindBy(css = "#gform_submit_button_2")
    private WebElement registerButton;

    @FindBy(css = "#cookie-acceptance > button:nth-child(1)")
    private WebElement cookieOk;

    public SignUpPage closeCoockiePopup() {
        waitTillIsClickable(cookieOk);
        
        cookieOk.click();
        log.info("Closing the cookie popup");
        return this;
    }

    public SignUpPage fillUpAllWithRandomData() {


        fillUpFirstName(FIRST_NAME);
        fillUpLastName(LAST_NAME);
        fillUpCompanyName(COMPANY_NAME);
        fillUpJobTitle(JOB_TITLE);
        fillUpEmail(EMAIL);
        fillUpPassword(PASSWORD);
        fillUpPasswordConf(CONFIRM_PASSWORD);
        fillUpAddress(STREET);
        fillUpAddress2(STREET2);
        fillUpStreetAddress(STREET_ADDRESS);
        fillUpCity(CITY);
        fillUpPhoneNo(PHONE_NUMBER);
        selectCountry(COUNTRY_ID);
        return this;

    }

    public SignUpPage selectCountry(int countryId) {
        waitTillIsClickable(countryComboBox.get(countryId));
        countryComboBox.get(countryId).click();
        log.info("Selecting the country from combobox");
        return this;
    }

    public SignUpPage fillUpPhoneNo(String phoneNumber) {
        waitTillIsClickable(phoneTextField);
        phoneTextField.sendKeys(phoneNumber);
        log.info("Filling out the phone number");
        return this;
    }

    public SignUpPage fillUpCity(String city) {
        waitTillIsClickable(cityTextField);
        cityTextField.sendKeys(city);
        log.info("Filling out the city");
        return this;
    }

    public SignUpPage fillUpStreetAddress(String town) {
        waitTillIsClickable(streetAddress2TextField);
        streetAddress2TextField.sendKeys(town);
        log.info("Filling out the street address line two");
        return this;
    }

    public SignUpPage fillUpAddress2(String area) {
        waitTillIsClickable(streetAddress1TextField);
        streetAddress1TextField.sendKeys(area);
        log.info("Filling out the street address");
        return this;
    }

    public SignUpPage fillUpAddress(String street) {
        waitTillIsClickable(adressTextField);
        adressTextField.sendKeys(street);
        log.info("Filling out the adress");
        return this;
    }

    public SignUpPage fillUpPasswordConf(String password) {
        waitTillIsClickable(confirmPassTextField);
        confirmPassTextField.sendKeys(password);
        log.info("Filling out the password confirmation");
        return this;
    }

    public SignUpPage fillUpPassword(String confirmPassword) {
        waitTillIsClickable(passTextField);
        passTextField.sendKeys(confirmPassword);
        log.info("Filling out the password");
        return this;
    }

    public SignUpPage fillUpEmail(String email) {
        waitTillIsClickable(emailTextField);
        emailTextField.sendKeys(email);
        log.info("Filling out the email");
        return this;
    }

    public SignUpPage fillUpJobTitle(String jobTitle) {
        waitTillIsClickable(jobTitleTextField);
        jobTitleTextField.sendKeys(jobTitle);
        log.info("Filling out the Job Title");
        return this;
    }

    public SignUpPage fillUpCompanyName(String companyName) {
        waitTillIsClickable(companyTextField);
        companyTextField.sendKeys(companyName);
        log.info("Filling out the Company Name");
        return this;
    }

    public SignUpPage fillUpLastName(String lastName) {
        waitTillIsClickable(lastNameTextField);
        lastNameTextField.sendKeys(lastName);
        log.info("Filling out the Last Name");
        return this;
    }

    public SignUpPage fillUpFirstName(String firstName) {
        waitTillIsClickable(firstNameTextField);
        firstNameTextField.sendKeys(firstName);
        log.info("Filling out the First Name");
        return this;
    }

    public SuccessRegister clickRegisterButton() {
        waitTillIsClickable(registerButton);
        registerButton.click();
        log.info("Clicking on the Register button");
        return new SuccessRegister();
    }
}