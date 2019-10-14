package tests.creationalDesignPattern;
import org.testng.annotations.Test;
import pages.SearchResultsPage;
import tests.BaseTest;
import utils.Categories;

public class SearchItemTests extends BaseTest {
    @Test(groups = Categories.SANITY)
    public void verifySearchResults() throws InterruptedException {
       homePage
               .searchItem()
               .verifySearchResultsSortByFeature();
    }
}
