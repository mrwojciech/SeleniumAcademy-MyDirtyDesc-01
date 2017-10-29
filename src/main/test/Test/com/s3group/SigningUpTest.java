package com.s3group;

import com.s3group.PageObject.S3MainPage;
import org.testng.annotations.Test;
import setUp.TestBase;


public class SigningUpTest extends TestBase {

    private S3MainPage s3MainPage;

    @Test
    public void shouldRegister() {
        s3MainPage = new S3MainPage();
        s3MainPage.goToSignUpPage()
                .closeCoockiePopup()
                .fillUpAllWithRandomData()
                .clickRegisterButton()
                .isSuccessRegister();
    }
}