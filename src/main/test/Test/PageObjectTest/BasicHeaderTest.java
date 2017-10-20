package PageObjectTest;

import org.testng.annotations.Test;
import setUp.TestBase;

public class BasicHeaderTest extends TestBase {


    @Test
    public void shouldDisplayCareersPage() {
        s3MainPage
                .goToCareersPage()
                .checkIfPageIsPresent();
    }

    @Test
    public void shouldDisplayNewsAndEventsPage() {
        s3MainPage
                .goToNewAndEventsPage()
                .checkIfPageIsPresent();
    }

    @Test
    public void shouldDisplayAboutPage() {
        s3MainPage
                .goToAboutPage()
                .checkIfPageIsPresent();
    }

    @Test
    public void shouldDisplayOurBusinessesPage() {
        s3MainPage
                .goToOurBusinessesPage()
                .checkIfPageIsPresent();
    }
}