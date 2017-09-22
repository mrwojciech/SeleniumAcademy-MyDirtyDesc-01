package com.s3group.PageObject;

import com.s3group.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;

public class SuccessRegister extends BasePage {

    @FindBy(css = "#gform_confirmation_message_2")
    private WebElement popup;

    public void isSuccessRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(popup));
        log.info("Wait till the element is clicable");
        assertEquals(popup.getText(), "Your account has been successfully activated." +
                " You can now access all restricted resources and areas.");
        log.info("Asserting the successful registration");
    }
}