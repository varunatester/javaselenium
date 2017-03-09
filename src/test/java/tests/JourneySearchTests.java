package tests;


import domain.JourneyDetails;
import domain.JourneyDetailsBuilder;
import org.testng.annotations.Test;
import pages.SearchResultsPage;
import utils.Categories;


public class JourneySearchTests extends BaseTest {

    SearchResultsPage searchResultsPage;

    @Test(groups = Categories.SANITY)
    public void verifySearchResultsSortedByPriceForSingleJourney() throws InterruptedException {
        JourneyDetails journeyDetails = new JourneyDetailsBuilder().isOneWay(true).build();
        searchResultsPage = homePage.searchForAOneWayJourneyWith(journeyDetails);
        searchResultsPage.verifyCheapestIsSelected();
        searchResultsPage.verifySearchResultsAreSortedByPrice();
    }
}
