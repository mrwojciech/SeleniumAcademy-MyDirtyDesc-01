package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;

public class SuccessRegister extends BasePage {
    private String CONFIRMATION = "Your account has been successfully activated." +
            " You can now access all restricted resources and areas.";

    @FindBy(css = "#gform_confirmation_message_2")
    private WebElement popup;

    public void isSuccessRegister() {
        waitTillIsClickable(popup);
        log.info("Wait till the element is clicable");

        assertEquals(popup.getText(), CONFIRMATION);
        log.info("Asserting the successful registration");
    }
}