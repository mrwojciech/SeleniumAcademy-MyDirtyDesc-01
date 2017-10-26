package PageObjectTest;

import com.s3group.PageObject.S3MainPage;
import org.testng.annotations.Test;
import setUp.TestBase;

public class BasicHeaderTest extends TestBase {

    private S3MainPage s3MainPage;
    @Test
    public void shouldDisplayCareersPage() {
        s3MainPage = new S3MainPage();

        s3MainPage
                .goToCareersPage()
                .assertIsPagePresent();
    }
/*
    @Test
    public void shouldDisplayNewsAndEventsPage() {
        s3MainPage
                .goToNewAndEventsPage()
                .assertIsPagePresent();
    }

    @Test
    public void shouldDisplayAboutPage() {
        s3MainPage
                .goToAboutPage()
                .assertIsPagePresent();
    }


    @Test
    public void shouldDisplayOurBusinessesPage() {
        s3MainPage
                .goToOurBusinessesPage()
                .assertIsPagePresent();
    }*/
}