package pages;

import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import utils.Constants;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;


public class SearchResultsPage extends LoadableComponent<SearchResultsPage>{

    WebDriver driver;
    LoadableComponent<HomePage> parent;
    public SearchResultsPage(WebDriver driver, LoadableComponent<HomePage> parent) {
        this.driver = driver;
        this.parent=parent;
    }

    @FindBy(className = "Sorting__mainActive___3vu1G")
    private WebElement activeTab;
    By resultsBody = By.className("Results__tabsBody___2LwJ4");
    By resultPriceList = By.className("Result__resultPrice___2q7ba");
    By resultPriceFraction = By.className("Result__priceFraction___22VYr");
    By resultPrice = By.className("Result__priceMain___1H-6K");
    By resultPriceSeparator = By.className("Result__pricePoint___1cRs7");


    public void verifyCheapestIsSelected() throws InterruptedException {
      System.out.println("a");
    }

    public void verifySearchResultsAreSortedByPrice() throws InterruptedException {
        WebElement resultBodyElement = new PageOperations(driver).waitForElementUntil(resultsBody);
        List<WebElement> resultPriceElement = resultBodyElement.findElements(resultPriceList);
        List<Double> priceValue = getResultPriceValue(resultPriceElement);
        assertTrue(Ordering.natural().isOrdered(priceValue), priceValue+Constants.listFailTextMessage);
    }

    private List<Double> getResultPriceValue(List<WebElement> result__resultPrice___2q7ba) {
        List<Double> list = new ArrayList<>();
        for (WebElement webElement : result__resultPrice___2q7ba) {
            String resultPriceFractionValue = webElement.findElement(resultPriceFraction).getText();
            String resultPriceValue = webElement.findElement(resultPrice).getText();
            String resultPriceSepartorValue = webElement.findElement(resultPriceSeparator).getText();
            list.add(Double.valueOf(resultPriceValue + resultPriceSepartorValue + resultPriceFractionValue));
        }
        return list;
    }

    @Override
    protected void load() {
     parent.get().searchItem();
    }

    @Override
    protected void isLoaded() throws Error {

    }
}
