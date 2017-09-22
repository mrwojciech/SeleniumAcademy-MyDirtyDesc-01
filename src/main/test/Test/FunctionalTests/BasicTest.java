package FunctionalTests;

import org.junit.Test;
import setUp.*;
public class BasicTest extends TestBase  {


    @Test
    public void shouldFoundResultsSearchingForSearchTerm() {
        String searchTerm = "Test automation";
        s3MainPage.unHideSearchBox()
                .searchForTerm(searchTerm)
                .checkIFResultsContainText(searchTerm);
    }
}