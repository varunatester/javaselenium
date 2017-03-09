package pages;


import domain.JourneyDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;
    SearchResultsPage searchResultsPage;

    @FindBy(css = ".departure.row-input")
    private WebElement departureCity;

    @FindBy(css = ".arrival.row-input")
    private WebElement arrivalCity;

    @FindBy(className = "sb-departureDate")
    private WebElement departureDate;

    @FindBy(id = "dLsbSubmit")
    private WebElement submit;

    @FindBy(className = "sb-checkbox")
    private WebElement bookingCheckbox;

    @FindBy(id="departureCity")
    private WebElement departureCityInput;

    @FindBy(id="arrivalCity")
    private WebElement arrivalCityInput;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage searchForAOneWayJourneyWith(JourneyDetails journeyDetails) throws InterruptedException {
        bookingCheckbox.click();
        this.enterOriginAs(journeyDetails.getOrigin());
        this.enterDestinationAs(journeyDetails.getDestination());
        searchResultsPage = this.searchForTheJourney();
        searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        return searchResultsPage;
    }

    public void enterOriginAs(String originCity) throws InterruptedException {
        departureCity.click();
        departureCityInput.sendKeys(originCity);
        selectTheFirstAvailableAutoCompleteOption(".departure.row-input");
    }

    public void enterDestinationAs(String destinationCity) throws InterruptedException {
        arrivalCity.click();
        arrivalCityInput.sendKeys(destinationCity);
        selectTheFirstAvailableAutoCompleteOption(".arrival.row-input");
    }

    public SearchResultsPage searchForTheJourney() {
        submit.click();
        return new SearchResultsPage(driver);
    }

    public void selectTheFirstAvailableAutoCompleteOption(String autoCompleteScroll) throws InterruptedException {
        WebElement originOptionsElement = new PageOperations(driver).waitForElementUntil(By.cssSelector(autoCompleteScroll));
        Thread.sleep(600);
        originOptionsElement.findElements(By.tagName("li")).get(0).click();
    }
}



