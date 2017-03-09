package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;


public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "Sorting__mainActive___3vu1G")
    private WebElement activeTab;
    By resultsBody = By.className("Results__tabsBody___2LwJ4");
    By resultPriceList = By.className("Result__resultPrice___2q7ba");
    By resultPriceFraction = By.className("Result__priceFraction___22VYr");
    By resultPrice = By.className("Result__priceMain___1H-6K");
    By resultPriceSeparator = By.className("Result__pricePoint___1cRs7");


    public void verifyCheapestIsSelected() throws InterruptedException {
        ExpectedConditions.textToBePresentInElement(activeTab, "Cheapest");
    }

    public void verifySearchResultsAreSortedByPrice() throws InterruptedException {
        WebElement resultBodyElement = new PageOperations(driver).waitForElementUntil(resultsBody);
        List<WebElement> resultPriceElement = resultBodyElement.findElements(resultPriceList);
        List<Double> priceValue = getResultPriceValue(resultPriceElement);
        assertTrue(verifyIsSortedBy(priceValue));
    }

    private List<Double> getResultPriceValue(List<WebElement> result__resultPrice___2q7ba) {
        List<Double> list = new ArrayList<>();
        for (WebElement webElement : result__resultPrice___2q7ba) {
            driver.findElement(resultPriceFraction);
            String resultPriceFractionValue = webElement.findElement(resultPriceFraction).getText();
            String resultPriceValue = webElement.findElement(resultPrice).getText();
            String resultPriceSepartorValue = webElement.findElement(resultPriceSeparator).getText();
            list.add(Double.valueOf(resultPriceValue + resultPriceSepartorValue + resultPriceFractionValue));
        }
        return list;
    }

    private boolean verifyIsSortedBy(List<Double> list) {
        Boolean isSorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
}
