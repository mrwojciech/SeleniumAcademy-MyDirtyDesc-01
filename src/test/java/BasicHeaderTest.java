import org.junit.Test;


public class BasicHeaderTest extends TestBase {

    S3MainPage s3MainPage;

    @Test
    public void shouldDisplayCareersPage() {
        s3MainPage = new S3MainPage(driver);
        s3MainPage.goToCareersPage().checkIfPageIsPresent();
    }

    @Test
    public void shouldDisplayNewsAndEventsPage() {
        s3MainPage = new S3MainPage(driver);
        s3MainPage.goToNewAndEventsPage().checkIfPageIsPresent();
    }

    @Test
    public void shouldDisplayAboutPage() {
        s3MainPage = new S3MainPage(driver);
        s3MainPage.goToAboutPage().checkIfPageIsPresent();
    }

    @Test
    public void shouldDisplayOurBusinessesPage() {
        s3MainPage = new S3MainPage(driver);
        s3MainPage.goToOurBusinessesPage().checkIfPageIsPresent();
    }
}