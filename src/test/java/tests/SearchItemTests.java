package tests;
import org.testng.annotations.Test;
import pages.SearchResultsPage;
import utils.Categories;

public class SearchItemTests extends BaseTest {
    SearchResultsPage searchResultsPage;
    @Test(groups = Categories.SANITY)
    public void verifySearchResults() throws InterruptedException {
        searchResultsPage = homePage.searchItem();
    }
}