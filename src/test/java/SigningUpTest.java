import org.junit.Test;


public class SigningUpTest extends TestBase {

    S3MainPage s3MainPage;

    @Test
    public void shouldRegister() {
        s3MainPage = new S3MainPage(driver);
        s3MainPage.goToSignUpPage()
                .closeCoockiePopup()
                .fillUpAllWithRandomData()
                .clickRegisterButton()
                .isSuccessRegister();
    }
}