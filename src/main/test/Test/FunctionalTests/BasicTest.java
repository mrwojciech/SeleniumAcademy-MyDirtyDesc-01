package FunctionalTests;

import org.testng.annotations.Test;
import setUp.TestBase;
public class BasicTest extends TestBase  {




    @Test
    public void shouldFoundResultsSearchingForSearchTerm() {
        String searchTerm = "Test automation";
        s3MainPage.unHideSearchBox()
                .searchForTerm(searchTerm)
                .checkIFResultsContainText(searchTerm);
    }
}