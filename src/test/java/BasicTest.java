import org.junit.Test;


public class BasicTest extends TestBase {

    S3MainPage s3MainPage;

    @Test
    public void shouldFoundResultsSearchingForSearchTerm() {
        String searchTerm = "Test automation";
        s3MainPage = new S3MainPage(driver);
        s3MainPage.unHideSearchBox()
                .searchForTerm(searchTerm)
                .checkIFResultsContainText(searchTerm);
    }
}