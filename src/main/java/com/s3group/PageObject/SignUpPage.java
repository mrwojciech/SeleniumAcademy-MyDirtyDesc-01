package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPage extends BasePage {

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
        waitTillIsClicable(cookieOk);
        log.info("Wait till the element is clicable");
        cookieOk.click();
        log.info("Closing the cookie popup");
        return this;
    }

    public SignUpPage fillUpAllWithRandomData() {
        fillUpFirstName("Wojtek");
        fillUpLastName("Nowak");
        fillUpCompanyName("Google");
        fillUpJobTitle("Engeener");
        fillUpEmail("jakis@gmail.com");
        fillUpPassword("password");
        fillUpPasswordConf("password");
        fillUpAddress("Januszowicka 4");
        fillUpAddress2("Dolny Sląsk");
        fillUpStreetAddress("Muchobór Mały");
        fillUpCity("Wrocław");
        fillUpPhoneNo("44-33-22");
        selectCountry(10);
        return this;

    }

    public SignUpPage selectCountry(int countryId) {
        waitTillIsClicable(countryComboBox.get(countryId));
        log.info("Wait till the element is clicable");
        countryComboBox.get(countryId).click();
        log.info("Selecting the country from combobox");
        return this;
    }

    public SignUpPage fillUpPhoneNo(String phoneNumber) {
        waitTillIsClicable(phoneTextField);
        log.info("Wait till the element is clicable");
        phoneTextField.sendKeys(phoneNumber);
        log.info("Filling out the phone number");
        return this;}

    public SignUpPage fillUpCity(String city) {
        waitTillIsClicable(cityTextField);
        log.info("Wait till the element is clicable");
        cityTextField.sendKeys(city);
        log.info("Filling out the city");
        return this;}

    public SignUpPage fillUpStreetAddress(String town) {
        waitTillIsClicable(streetAddress2TextField);
        log.info("Wait till the element is clicable");
        streetAddress2TextField.sendKeys(town);
        log.info("Filling out the street address line two");
        return this;}

    public SignUpPage fillUpAddress2(String area) {
        waitTillIsClicable(streetAddress1TextField);
        log.info("Wait till the element is clicable");
        streetAddress1TextField.sendKeys(area);
        log.info("Filling out the street address");
        return this;}

    public SignUpPage fillUpAddress(String street) {
        waitTillIsClicable(adressTextField);
        log.info("Wait till the element is clicable");
        adressTextField.sendKeys(street);
        log.info("Filling out the adress");
        return this;}

    public SignUpPage fillUpPasswordConf(String password) {
        waitTillIsClicable(confirmPassTextField);
        log.info("Wait till the element is clicable");
        confirmPassTextField.sendKeys(password);
        log.info("Filling out the password confirmation");
        return this;}

    public SignUpPage fillUpPassword(String confirmPassword) {
        waitTillIsClicable(passTextField);
        log.info("Wait till the element is clicable");
        passTextField.sendKeys(confirmPassword);
        log.info("Filling out the password");
        return this;}

    public SignUpPage fillUpEmail(String email) {
        waitTillIsClicable(emailTextField);
        log.info("Wait till the element is clicable");
        emailTextField.sendKeys(email);
        log.info("Filling out the email");
        return this;}

    public SignUpPage fillUpJobTitle(String jobTitle) {
        waitTillIsClicable(jobTitleTextField);
        log.info("Wait till the element is clicable");
        jobTitleTextField.sendKeys(jobTitle);
        log.info("Filling out the Job Title");
        return this;}

    public SignUpPage fillUpCompanyName(String companyName) {
        waitTillIsClicable(companyTextField);
        log.info("Wait till the element is clicable");
        companyTextField.sendKeys(companyName);
        log.info("Filling out the Company Name");
        return this;}

    public SignUpPage fillUpLastName(String lastName) {
        waitTillIsClicable(lastNameTextField);
        log.info("Wait till the element is clicable");
        lastNameTextField.sendKeys(lastName);
        log.info("Filling out the Last Name");
        return this;    }

    public SignUpPage fillUpFirstName(String firstName) {
        waitTillIsClicable(firstNameTextField);
        log.info("Wait till the element is clicable");
        firstNameTextField.sendKeys(firstName);
        log.info("Filling out the First Name");
        return this; }

    public SuccessRegister clickRegisterButton() {
        waitTillIsClicable(registerButton);
        log.info("Wait till the element is clicable");
        registerButton.click();
        log.info("Clicking on the Register button");
        return new SuccessRegister();
    }
}