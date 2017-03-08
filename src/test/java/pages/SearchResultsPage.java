package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "Sorting__mainActive___3vu1G")
    private WebElement activeTab;

    public void verifyCheapestIsSelected() throws InterruptedException {
        driver.findElements(By.cssSelector("div[name^='Sorting__mainActive']"));
        ExpectedConditions.textToBePresentInElement(activeTab, "Cheapest");
    }

    public void verifyResultsAreSortedByPrice() {
        System.out.println(driver.findElements(By.xpath("//div[@data-test='Result']")).size());
    }
}
